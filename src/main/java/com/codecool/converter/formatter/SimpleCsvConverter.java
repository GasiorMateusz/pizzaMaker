package com.codecool.converter.formatter;

import com.codecool.converter.FileReader;

import java.io.File;

public class SimpleCsvConverter {

    FileReader fileReader = new FileReader();

    public void converter(File file, OutputFormatter formatter) {
        System.out.println("Conversion");
        formatter.printToConsole(fileReader.readData(file));
    }

}
