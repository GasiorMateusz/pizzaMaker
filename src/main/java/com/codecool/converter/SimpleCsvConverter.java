package com.codecool.converter;

import java.io.File;

public class SimpleCsvConverter {

    ConverterTypeManager converterType;

    public void converter(File file) {
        System.out.println("I convert CSV to output format");
        converterType.executeConversion(file);
    }

    public void setType(ConverterTypeManager converterType) {
        this.converterType = converterType;
    }
}
