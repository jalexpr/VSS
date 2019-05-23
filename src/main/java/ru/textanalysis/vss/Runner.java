package ru.textanalysis.vss;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static ru.textanalysis.vss.Validator.validStructure;

public class Runner {
    public static void main(String[] args) throws IOException {
        for (File file : new File(args[1]).listFiles()) {
            if (file.getName().contains("docx")) {
                List<String> errors = validStructure(args[0], file);
                System.out.println(file.getName() + " : " + (errors.isEmpty() ? "good" : errors));
            }
        }
    }
}
