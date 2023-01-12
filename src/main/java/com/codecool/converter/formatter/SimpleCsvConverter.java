package com.codecool.converter.formatter;

import com.codecool.converter.FileFormat;
import com.codecool.converter.FileReader;

import java.io.File;

public class SimpleCsvConverter {

    OutputFormatter outputFormatter;
    OutputFormatterFactory outputFormatterFactory = new OutputFormatterFactory();
    FileReader fileReader = new FileReader();

    public void converter(File file, FileFormat... outputFormat) {
        if (outputFormat.length == 0) {
            outputFormat = new FileFormat[]{FileFormat.TABLE};
        }
        this.outputFormatter = outputFormatterFactory.createByFormat(outputFormat[0]);
        System.out.println("I convert CSV to output format");
        this.outputFormatter.printToConsole(fileReader.readData(file));
        this.outputFormatter.outputFormatter();
    }

}
