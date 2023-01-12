package com.codecool.converter.formatter;


import java.io.InputStream;

public class JsonFormatter implements OutputFormatter {

    @Override
    public void outputFormatter() {

    }

    @Override
    public void printToConsole(InputStream inputStream) {
        System.out.println("formatted to JSON");
//        String csvAsString = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
//        String json = CDL.toJSONArray(csvAsString).toString();
//        System.out.println(json);
    }
}

