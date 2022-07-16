package com.infogalaxy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo1 {
    public static void main(String[] args) {
        try {
        System.out.println("Arshad");
        String name = "My Name is Arshad";
        Path filePath = Paths.get("Sample.txt");
        byte[] bytename = name.getBytes();

            Files.write(filePath,bytename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
