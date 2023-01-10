package com.codecool.converter;

import java.io.File;
import java.util.Arrays;

public class ConverterApplication {

    public static void main(String[] args) {
        if (!Arrays.stream(args).findAny().isPresent()) {
            System.out.println("No input file defined");
        } else if (args.length == 1 && utils.doesFileExist(args[0])) {
            ifArgValidDisplayCSV(args);
        } else if (args.length == 2) {
            ifArgsValidExecuteConversion(args);
        } else {
            System.out.println("invalid parameters");
        }

    }

    private static void ifArgValidDisplayCSV(String[] args) {
        //path -> display file data in table fixme
        File file = new File(args[0]);
    }

    private static void ifArgsValidExecuteConversion(String[] args) {
        FileFormat format = null;
        File file;
        if (utils.doesFileExist(args[0])) {
            file = new File(args[0]);
            format = utils.getIfIsFileFormat(args[1]);
        } else if (utils.doesFileExist(args[1])) {
            file = new File(args[1]);
            format = utils.getIfIsFileFormat(args[0]);
        }
        if (format != null) {
            if (format.equals(FileFormat.XML)) {
                //it is xml fixme
                System.out.println("convert to xml");
            } else if (format.equals(FileFormat.JSON)) {
                //it is json fixme
                System.out.println("convert to json");
            }
        } else {
            System.out.println("unsupported extension type : " + format);
        }

    }

}
