package com.yaya.io;

/*
RandomAccessFile是java提供的对文件内容的访问，既可以读文件，也可以写文件。
而且可以随机访问文件，即可以访问文件的任意位置。

Java文件模型：
  在硬盘上的文件是byte，byte，byte存储的，是数据的集合
打开文件
  有两种模式“rw”读写，“r”只读。
  该类在市容write写数据时，一次最多写8位，如果写的内容大于8位，就会只写后8位。
 */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileMain {

    public static void main(String[] args) throws IOException {

        File file = new File("src" + File.separator
                + "com" + File.separator
                + "yaya" + File.separator
                + "io" + File.separator
                + "Three.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        System.out.println("文件长度:" + raf.length());

        System.out.println("指针位置:" + raf.getFilePointer());
        raf.write('A');
        raf.writeInt(2);

        byte[] bytes = new byte[(int) raf.length() - 4];
        raf.seek(0);
        raf.read(bytes);
        System.out.println("指针的位置" + raf.getFilePointer());
        String s = new String(bytes);
        System.out.println("写入的数据是：" + s + raf.readInt());
        raf.close();

    }
}
