package com.yaya.io.input.stream;

import com.yaya.io.ConstantFilePath;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class JavaBufferedInputStream {

    public void bufferedInputStreamMethod() {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(ConstantFilePath.INPUT_PATH))) {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
