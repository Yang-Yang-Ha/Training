package com.yaya.io.output.stream;

import com.yaya.io.ConstantFilePath;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class JavaByteArrayOutputStream {

    public void byteArrayOutputStreamMethod() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(6);
            byteArrayOutputStream.writeTo(new FileOutputStream(ConstantFilePath.OUTPUT_PATH));
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
