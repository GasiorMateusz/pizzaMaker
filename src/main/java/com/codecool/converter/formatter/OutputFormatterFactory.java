package com.codecool.converter.formatter;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(String outputFormat) {
        switch (outputFormat.toUpperCase()) {
            case "XML":
                return new XmlFormatter();
            case "JSON":
                return new JsonFormatter();
            case "TABLE":
                return new CsvFormatter();
            default:
                throw new IllegalArgumentException("Unknown format " + outputFormat);
        }
    }

}
