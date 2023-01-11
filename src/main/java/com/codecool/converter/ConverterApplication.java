package com.codecool.converter;

import java.io.File;
import java.util.Arrays;

public class ConverterApplication {

    public static void main(String[] args) {
        if (!Arrays.stream(args).findAny().isPresent()) {
            System.out.println("No input file defined");
        } else if (args.length == 1 && utils.doesFileExist(args[0])) {
            ifArgValidDisplayCSVinTableFormat(args);
        } else if (args.length == 2) {
            ifArgsValidExecuteConversion(args);
        } else {
            System.out.println("invalid parameters");
        }

    }

    private static void ifArgValidDisplayCSVinTableFormat(String[] args) {
        File file = new File(args[0]);
        System.out.println("convert to table");
        SimpleCsvConverter converter = new SimpleCsvConverter();
        converter.setType(new CSVConverter());
        converter.converter(file);
    }

    private static void ifArgsValidExecuteConversion(String[] args) {
        FileFormat format = null;
        File file = null;
        if (utils.doesFileExist(args[0])) {
            file = new File(args[0]);
            format = utils.getIfIsFileFormat(args[1]);
        } else if (utils.doesFileExist(args[1])) {
            file = new File(args[1]);
            format = utils.getIfIsFileFormat(args[0]);
        }
        SimpleCsvConverter converter = new SimpleCsvConverter();

        if (format != null && file != null) {
            if (format.equals(FileFormat.XML)) {
                converter.setType(new XmlConverter());
                System.out.println("convert to xml");
            } else if (format.equals(FileFormat.JSON)) {
                converter.setType(new JsonConverter());
                System.out.println("convert to json");
            }
            converter.converter(file);
        }

        if (file == null) {
            System.out.println("file doesn't exist");
        } else if (format == null) {
            System.out.println("unsupported extension type");

        }

    }

}
