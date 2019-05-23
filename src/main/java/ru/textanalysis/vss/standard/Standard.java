package ru.textanalysis.vss.standard;

import ru.textanalysis.vss.data.Heading;

import java.util.Arrays;
import java.util.List;

public abstract class Standard {
    private final String name;
    private final List<Heading<List<String>>> headings;

    Standard(String name, Heading<List<String>>... headings) {
        this.name = name;
        this.headings = Arrays.asList(headings);
    }

    public List<Heading<List<String>>> getHeadings() {
        return headings;
    }

    public String getName() {
        return name;
    }
}
