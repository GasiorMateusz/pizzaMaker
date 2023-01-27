package com.codecool.converter.formatter;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


public class CsvFormatter implements OutputFormatter {

    @Override
    public void printToConsole(InputStream inputStream) {
        System.out.println("formatted to CSV table");
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            StringBuilder sb = new StringBuilder();
            sb.append("|");
            String[] line = scanner.nextLine().split(",");
            System.out.println(Arrays.toString(line));
        }
    }

    @Override
    public void outputFormatter() {

    }
}
