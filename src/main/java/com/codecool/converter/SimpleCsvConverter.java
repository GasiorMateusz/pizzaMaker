package com.codecool.converter;

import java.io.File;

public class SimpleCsvConverter {

    ConverterTypeManager converterType;
    FileReader fileReader = new FileReader();

    public void converter(File file, FileFormat... outputFormat) {

        System.out.println("I convert CSV to output format");
        converterType.executeConversion(fileReader.readData(file));
    }

    public void setType(ConverterTypeManager converterType) {
        this.converterType = converterType;
    }
}
