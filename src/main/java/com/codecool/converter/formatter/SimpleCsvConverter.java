package com.codecool.converter.formatter;

import com.codecool.converter.FileFormat;
import com.codecool.converter.FileReader;

import java.io.File;

public class SimpleCsvConverter {

    OutputFormatter outputFormatter;
    FileReader fileReader = new FileReader();

    public void converter(File file, FileFormat... outputFormat) {

        System.out.println("I convert CSV to output format");
        this.outputFormatter.executeConversion(fileReader.readData(file));
    }

    public void setType(OutputFormatter converterType) {
        this.outputFormatter = converterType;
    }
}
