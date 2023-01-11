package com.codecool.converter;

import java.io.File;

public class CSVConverter implements ConverterTypeManager {
    @Override
    public void executeConversion(File file) {
        System.out.println("CSV conversion");
    }
}
