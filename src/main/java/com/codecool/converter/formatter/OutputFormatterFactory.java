package com.codecool.converter.formatter;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(FileFormat outputFormat) {
        if (outputFormat == null)
            return null;
        switch (outputFormat) {
            case XML:
                return new XmlFormatter();
            case JSON:
                return new JsonFormatter();
            case TABLE:
                return new CsvFormatter();
            default:
                throw new IllegalArgumentException("Unknown format " + outputFormat);
        }
    }

}
