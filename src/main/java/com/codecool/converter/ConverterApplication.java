package com.codecool.converter;

import java.io.File;
import java.util.Arrays;

public class ConverterApplication {

    public static void main(String[] args) {
        if (!Arrays.stream(args).findAny().isPresent()) {
            System.out.println("No input file defined");
        } else if (args.length == 1 && utils.isValidPath(args[0])) {
            ifArgValidDisplayCSV(args);
        } else if (args.length == 2) {
            ifArgsValidExecuteConvertion(args);
        } else{
            System.out.println("invalid parameters");
        }

    }

    private static void ifArgValidDisplayCSV(String[] args) {
        //path -> display file data in table fixme
        File file = new File(args[0]);
    }

    private static void ifArgsValidExecuteConvertion(String[] args) {
        String format = null;
        if(utils.isValidPath(args[0])){
            File file = new File(args[0]);
            format = args[1];
        }else if(utils.isValidPath(args[1])){
            File file = new File(args[1]);
            format = args[0];
        }
        if (format != null && !format.isEmpty()) {
            if (format.equalsIgnoreCase("xml")) {
                //it is xml fixme
            } else if (format.equalsIgnoreCase("json")) {
                //it is json fixme
            } else {
                System.out.println("unsupported extension type");
            }
        }
    }

}
