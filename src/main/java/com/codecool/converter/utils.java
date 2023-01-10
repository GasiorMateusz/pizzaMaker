package com.codecool.converter;

import java.io.File;
import java.util.Arrays;

public class utils {

    public static boolean doesFileExist(String path) {
        File f = new File(path);
        return f.exists() && !f.isDirectory();
    }

    public static FileFormat getIfIsFileFormat(String input) {
        return Arrays.stream(FileFormat.values()).filter(
                fileFormat -> fileFormat.getValue().equals(input.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

}
