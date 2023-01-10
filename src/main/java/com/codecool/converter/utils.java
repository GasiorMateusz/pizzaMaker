package com.codecool.converter;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class utils {

    public static boolean isValidPath(String path) {
        try {
            Paths.get(path);
        } catch (InvalidPathException | NullPointerException ex) {
            return false;
        }
        return true;
    }

}
