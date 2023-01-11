package com.codecool.converter.formatter;

import com.codecool.converter.FileFormat;
import com.codecool.converter.FileReader;

import java.io.File;

public class SimpleCsvConverter {

    OutputFormatter outputFormatter;
    OutputFormatterFactory outputFormatterFactory = new OutputFormatterFactory();
    FileReader fileReader = new FileReader();

    public void converter(File file, FileFormat... outputFormat) {
        if (outputFormat.length == 1) {
            outputFormat[0] = FileFormat.TABLE;
        }
        this.outputFormatter = outputFormatterFactory.createByFormat(outputFormat[0]);
        System.out.println("I convert CSV to output format");
        this.outputFormatter.executeConversion(fileReader.readData(file));
    }

}
