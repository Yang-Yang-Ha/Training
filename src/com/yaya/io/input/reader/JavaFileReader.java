package com.yaya.io.input.reader;

import com.yaya.io.ConstantFilePath;

import java.io.FileReader;

public class JavaFileReader {

    public void fileReaderMethod() {
        try (FileReader fileReader = new FileReader(ConstantFilePath.INPUT_PATH)) {
            int i;
            while ((i = fileReader.read()) != -1)
                System.out.print(i);
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
