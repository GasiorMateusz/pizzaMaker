package com.codecool.converter.formatter;

import com.codecool.converter.FileFormat;

public class OutputFormatterFactory {

    OutputFormatter createByFormat(FileFormat outputFormat) {
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
