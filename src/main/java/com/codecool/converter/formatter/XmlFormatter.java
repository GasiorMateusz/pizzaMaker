package com.codecool.converter.formatter;

import java.io.InputStream;

public class XmlFormatter implements OutputFormatter {

    @Override
    public void outputFormatter() {
    }

    @Override
    public void printToConsole(InputStream inputStream) {
        System.out.println("Formatted to XML");
    }
}

