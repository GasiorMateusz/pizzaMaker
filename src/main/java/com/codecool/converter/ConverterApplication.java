package com.codecool.converter;

import java.util.Arrays;

public class ConverterApplication {

    public static void main(String[] args) {
        if(!Arrays.stream(args).findAny().isPresent()){
            System.out.println("No input file defined");
        }else {
            System.out.println(args);
        }
    }

}
