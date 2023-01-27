package com.codecool.converter;

import java.io.File;

public class utils {

    public static boolean doesFileExist(String path) {
        File f = new File(path);
        return f.exists() && !f.isDirectory();
    }

}
