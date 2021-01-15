package io.input.reader;

import io.ConstantFilePath;

import java.io.BufferedReader;
import java.io.FileReader;

public class JavaBufferedReader {

    public void bufferedReaderMethod() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ConstantFilePath.INPUT_PATH))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
