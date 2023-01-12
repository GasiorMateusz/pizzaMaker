package com.codecool.converter.formatter;

import javax.xml.parsers.DocumentBuilder;
import java.io.InputStream;

public class XmlFormatter implements OutputFormatter {

    @Override
    public void outputFormatter() {

    }
    protected DocumentBuilder domBuilder = null;

    @Override
    public void printToConsole(InputStream inputStream) {
       System.out.println("Formatted to XML");
    }
}

