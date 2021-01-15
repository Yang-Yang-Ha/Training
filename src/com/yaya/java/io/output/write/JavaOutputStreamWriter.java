package io.output.write;

import io.ConstantFilePath;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class JavaOutputStreamWriter {

    public void outputStreamWriterMethod() {
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(ConstantFilePath.OUTPUT_PATH))) {
            outputStreamWriter.write("Hi, I'm fine");
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
