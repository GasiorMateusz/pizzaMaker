package com.codecool.converter;

import java.io.File;

public class XmlConverter implements ConverterTypeManager {

    @Override
    public void executeConversion(File file) {
        System.out.println("XML conversion");
    }
}

