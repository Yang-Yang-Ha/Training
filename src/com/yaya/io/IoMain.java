package com.yaya.io;


import java.io.File;
import java.io.IOException;

/*
使用字节流进行读取文件时，当读到到字节是-1时停止
 */
public class IoMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src" + File.separator
                + "com" + File.separator
                + "yaya" + File.separator
                + "io" + File.separator
                + "Three.txt");

        File copyFile = new File("src" + File.separator
                + "com" + File.separator
                + "yaya" + File.separator
                + "io" + File.separator
                + "copy.txt");
        File dataFile = new File("src" + File.separator
                + "com" + File.separator
                + "yaya" + File.separator
                + "io" + File.separator
                + "Student.dat");

//        IoUtils.printToHexString(file);
//        IoUtils.printToHexFromByteArray(file);
//        IoUtils.writeToFile(file);
//        IoUtils.copyFile(file, copyFile);
//        IoUtils.printStringFile(file);
//        IoUtils.copyStringFile(file,copyFile);
        Student student = new Student("stephen", 26, "WestNorthUniversity", "090196");
        IoUtils.serializeObject(student, dataFile);
        Student readStudent = (Student) IoUtils.deserializeObject(dataFile);
        System.out.println(readStudent.toString());
    }


}
