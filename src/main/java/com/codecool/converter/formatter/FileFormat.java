package com.codecool.converter.formatter;

public enum FileFormat {

    XML("xml"),
    JSON("json"),
    TABLE("table");

    private final String format;

    FileFormat(String format) {
        this.format = format;
    }

    public String getValue() {
        return format;
    }
}
