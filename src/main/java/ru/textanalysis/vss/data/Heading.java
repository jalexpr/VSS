package ru.textanalysis.vss.data;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heading<T> {
    private final Integer laval;
    private final T values;
    private final List<Heading<T>> subheadings;

    public Heading(Integer laval, T values, Heading<T>... subheadings) {
        this.laval = laval;
        this.values = values;
        this.subheadings = new ArrayList<>();
        this.subheadings.addAll(Arrays.asList(subheadings));
    }

    public Integer getLaval() {
        return laval;
    }

    public T getValues() {
        return values;
    }

    public List<Heading<T>> getSubheadings() {
        return subheadings;
    }

    public void addSubheadings(List<Heading<T>> heading) {
        subheadings.addAll(heading);
    }

    @Override
    public String toString() {
        return laval + ":" + (values instanceof XWPFParagraph ? ((XWPFParagraph) values).getText() : values);
    }
}
