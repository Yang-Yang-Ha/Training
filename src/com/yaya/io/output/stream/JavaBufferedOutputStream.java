package com.yaya.io.output.stream;

import com.yaya.io.ConstantFilePath;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class JavaBufferedOutputStream {

    public void bufferedOutputStreamMethod() {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(ConstantFilePath.OUTPUT_PATH))) {
            String s = "Stephen";
            byte[] b = s.getBytes();
            bufferedOutputStream.write(b);
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
