package com.codecool.converter;

import com.codecool.converter.formatter.SimpleCsvConverter;

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
        System.out.println("convert to table");
        SimpleCsvConverter converter = new SimpleCsvConverter();
        converter.converter(new File(args[0]));
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
            converter.converter(file, format);
        }
        if (file == null) {
            System.out.println("file doesn't exist");
        } else if (format == null) {
            System.out.println("unsupported extension type");
        }

    }

}
