package com.codecool.converter;

import java.io.File;

public class JsonConverter implements ConverterTypeManager {

    @Override
    public void executeConversion(File file) {
        System.out.println("json conversion");
    }
}

