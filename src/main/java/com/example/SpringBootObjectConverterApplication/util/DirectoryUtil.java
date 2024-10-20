package com.example.SpringBootObjectConverterApplication.util;


import java.io.File;

public class DirectoryUtil {
    public static void createDirectoryIfNotExists(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }
}
