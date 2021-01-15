package io.input.reader;

import io.ConstantFilePath;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JavaInputStreamReader {

    public void inputStreamReaderMethod() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(ConstantFilePath.INPUT_PATH));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
