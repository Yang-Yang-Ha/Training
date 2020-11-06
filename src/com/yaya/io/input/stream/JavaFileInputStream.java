package com.yaya.io.input.stream;

import com.yaya.io.ConstantFilePath;

import java.io.FileInputStream;

public class JavaFileInputStream {

    public void fileInputStreamMethod() {
        try (FileInputStream fileInputStream = new FileInputStream(ConstantFilePath.INPUT_PATH)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i + "-");
                System.out.println("Available Count: " + fileInputStream.available());
            }
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
