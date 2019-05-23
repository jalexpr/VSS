package ru.textanalysis.vss;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import ru.textanalysis.tfwwt.parser.string.Parser;
import ru.textanalysis.vss.data.Heading;
import ru.textanalysis.vss.standard.Gost_19_201_78;
import ru.textanalysis.vss.standard.Gost_34_602_89;
import ru.textanalysis.vss.standard.Standard;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Validator {
    private static Map<String, Standard> standards;

    static {
        standards = new HashMap<>();
        Standard standard = new Gost_19_201_78();
        standards.put(standard.getName(), standard);
        standard = new Gost_34_602_89();
        standards.put(standard.getName(), standard);
    }

    public static List<String> validStructure(String standardName, File file) throws IOException {
        Standard standard = standards.get(standardName);

        List<Heading<XWPFParagraph>> headings = getHeading(file);

        return validate(standard.getHeadings(), headings);
    }

    private static List<String> validate(List<Heading<List<String>>> standard, List<Heading<XWPFParagraph>> headings) {
        List<String> errors = new ArrayList<>();
        headings.forEach(actual -> {
            Heading<List<String>> stdHeading = validated(standard, actual);
            if (stdHeading == null) {
                errors.add(actual.getLaval() + ":" + actual.getValues().getText());
                actual.getSubheadings().forEach(heading -> errors.add(heading.getLaval() + ":" + heading.getValues().getText()));
            } else {
                validate(stdHeading.getSubheadings(), actual.getSubheadings());
            }
        });
        return errors;
    }

    private static Heading<List<String>> validated(List<Heading<List<String>>> standard, Heading<XWPFParagraph> actual) {
        return standard.stream()
                .filter(heading -> {
                    if (heading.getValues().size() > 1) {
                        for (String str : Parser.parserBasicsPhase(actual.getValues().getText().toUpperCase())) {
                            if (heading.getValues().contains(str)) return true;
                        }
                        return false;
                    } else {
                        return actual.getValues().getText().toUpperCase().contains(heading.getValues().get(0));
                    }
                })
                .findFirst().orElse(null);
    }

    private static List<Heading<XWPFParagraph>> getHeading(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file);
             XWPFDocument document = new XWPFDocument(fis)) {
            ListIterator<XWPFParagraph> iterator = document.getParagraphs().listIterator();

            return getHeadingsByLaval(1, document.getStyles(), iterator);
        }
    }

    private static List<Heading<XWPFParagraph>> getHeadingsByLaval(Integer laval, XWPFStyles styles, ListIterator<XWPFParagraph> iterator) {
        List<Heading<XWPFParagraph>> headings = new ArrayList<>();
        Heading<XWPFParagraph> heading1 = null;
        List<Heading<XWPFParagraph>> terms2 = new ArrayList<>();
        while (iterator.hasNext()) {
            XWPFParagraph prg = iterator.next();
            if (prg.getStyleID() != null) {
                if (isStyleBy(styles, prg, "heading " + (laval - 1))) {
                    iterator.previous();
                    break;
                } else if (isStyleBy(styles, prg, "heading " + laval)) {
                    if (heading1 != null) {
                        heading1.addSubheadings(terms2);
                    }
                    heading1 = new Heading<>(laval, prg);
                    headings.add(heading1);
                    terms2 = new ArrayList<>();
                } else if (isStyleBy(styles, prg, "heading " + (laval + 1))) {
                    iterator.previous();
                    terms2.addAll(getHeadingsByLaval(laval + 1, styles, iterator));
                }
            }
        }
        return headings;
    }

    private static boolean isStyleBy(XWPFStyles styles, XWPFParagraph prg, String staly) {
        return styles.getStyle(prg.getStyleID()).getName().equals(staly);
    }
}
