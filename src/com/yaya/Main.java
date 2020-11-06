package com.yaya;

import com.yaya.io.IoApplication;

public class Main {

    public static void main(String[] args) {
        IoApplication ioApplication = new IoApplication();
        ioApplication.manualImplement("String.txt", "StringCopy.txt");
    }
}
