package com.yaya.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class IoApplication {

    public void copy(String sourcePath, String destinationPath) {
        File source = new File(sourcePath);
        File destination = new File(destinationPath);
        try {
            Files.copy(source.toPath(), destination.toPath());
        } catch (IOException ioException) {
            System.out.println(ioException.toString());
        }
    }

    public void manualImplement(String sourcePath, String destinationPath) {
        try (FileInputStream fileInputStream = new FileInputStream(sourcePath); FileOutputStream fileOutputStream = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) != 0) {
                fileOutputStream.write(buffer, 0, length);
            }

        } catch (IOException ioException) {
            System.out.println(ioException.toString());
        }
    }
}
