package com.codecool.converter;

import com.codecool.converter.formatter.OutputFormatter;
import com.codecool.converter.formatter.SimpleCsvConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Arrays;

public class ConverterApplication {

    public static void main(String[] args) {

        if (!Arrays.stream(args).findAny().isPresent()) {
            System.out.println("No input file defined");
        } else {
            SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter();
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml") {
                    };
            if (args.length == 1 && utils.doesFileExist(args[0])) {
                simpleCsvConverter.converter(new File(args[0]), (OutputFormatter) context.getBean("formatter","table"));
            } else if (args.length == 2) {
                simpleCsvConverter.converter(new File(args[0]), (OutputFormatter) context.getBean("formatter",args[1]));
            } else {
                System.out.println("invalid parameters");
            }
        }
    }

}
