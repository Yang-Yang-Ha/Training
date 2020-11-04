package com.yaya.io;

import java.io.*;

public class IoUtils {

    /*
    FileInput字节流输入流
     */
    public static void printToHexString(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        int b;
        int i = 1;
        while ((b = fis.read()) != -1) {
            System.out.print(Integer.toBinaryString(b) + "  ");
            if (i++ % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        fis.close();
    }

    /*
    FileInput字节流输入流
     */
    public static void printToHexFromByteArray(File file) throws IOException {
        /*
        为什么使用该方法打印出的byte不是8位
         */
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1];
        int readCount;
        while ((readCount = fis.read(bytes)) != -1) {
            int i = 1;
            for (int j = 0; j < readCount; j++) {
                System.out.print(Integer.toBinaryString(bytes[j]) + "  ");
                if (i++ % 10 == 0) {
                    System.out.println();
                }
            }

        }
        System.out.println();
        fis.close();
    }

    /*
    FileOutput字节流输出流
     */
    public static void writeToFile(File file) throws IOException {
        //如果文件不存在，则创建，如果存在，删除后重建
        FileOutputStream fos = new FileOutputStream(file);
        //如果文件存在，在后面添加，如果不存在，新建
        //FileOutputStream fos=new FileOutputStream(file,true);
        fos.write('A');
        fos.write('b');
        int a = 10;
        fos.write(a >>> 24);
        fos.write(a >>> 16);
        fos.write(a >>> 8);
        fos.write(a);
        byte[] utf = "中国".getBytes("utf-8");
        fos.write(utf);
        fos.close();
        printToHexString(file);
    }

    /*
    FileInput和FileOutput进行文件拷贝
     */
    public static void copyFile(File srcFile, File targetFile) throws IOException {
        if (!srcFile.exists()) {
            throw new IllegalArgumentException(srcFile.getName() + "文件不存在");
        }

        if (!srcFile.isFile()) {
            throw new IllegalArgumentException(srcFile.getName() + "不是文件");
        }

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

        byte[] bytes = new byte[8];
        int readCount;
        while ((readCount = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, readCount);
            fos.flush();
        }
        fis.close();
        fos.close();
    }

    /*
    DataInput输入流，可以更方便得读取int，long，字符等类型数据
    DataOutput输出流，可以更方便得写入int，long，字符等类型数据
    这是对输入输出流得装饰
    BufferedInput输入流，带缓冲区得输入流，提高输入性能。
    BufferedOutput输出流，带缓冲区得输入流，提高输出性能。
     */



    /*
    字符流
    文本（char）是16位无符号整数，是字符得Unicode编码（双字节编码），文件是byte，byte 。。得数据序列
    文本文件是文本序列按照某种编码方案（utf-8,utf-16be,gbk）序列化为byte的存储结果
    字符的处理，一次处理一个字符
    字符的底层仍然是基本的字节序列

    字符字节流的转换
    InputStreamReader:完成byte流解析为char流，按照编码解析
    OutputStreamWriter：提供char流到byte流，按照编码模式处理

    FileReader/FileWriter
    BufferedReader/BufferedWriter/PrintWriter 可以一次读一行或者写一行
     */

    public static void printStringFile(File file) throws IOException {

        if (!file.exists()) {
            throw new IllegalArgumentException(file.getName() + "文件不存在");
        }

        if (!file.isFile()) {
            throw new IllegalArgumentException(file.getName() + "不是文件");
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.print(s);
            System.out.println();
        }
        fr.close();


    }

    public static void copyStringFile(File srcFile, File targetFile) throws IOException {
        if (!srcFile.exists()) {
            throw new IllegalArgumentException(srcFile.getName() + "文件不存在");
        }

        if (!srcFile.isFile()) {
            throw new IllegalArgumentException(srcFile.getName() + "不是文件");
        }

        FileReader fr = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(targetFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);
        String s;
        while ((s = br.readLine()) != null) {
//            bw.write(s, 0, s.length());
//            bw.newLine();
//            bw.flush();
            pw.println(s);
            pw.flush();
        }

        fr.close();
        fw.close();

    }

    /*
    对象的序列化和反序列化
    对象序列化就是将object对象转换成byte序列，反之叫对象的序列化
    序列化流（ObjectOutputStream）---writeObject
    反序列化流（ObjectInputStream） ---readObject
    序列化接口（Serializable）：对象必须实现序列化接口，才能进行序列化，否则将出现异常，这个接口为标记接口
     */

    /*
    transient关键字：在序列化类中修饰变量，表示该变量不会进行jvm默认的序列化工作，但可以自己完成序列化
     */

    /*
    对子类对象进行序列化或者反序列化操作时，
    如果父类么有实现序列化接口
    那么父类的构造函数会被显示调用
     */

    public static void serializeObject(Serializable serializable, File targetFile) throws IOException {
        //当传入的file不存在时，不会新建文件而会报错。
        if (!targetFile.exists()) {
            boolean isCreate = targetFile.createNewFile();
            if (!isCreate) {
                throw new IOException(targetFile.getName() + "文件创建失败");
            }
        }

        if (!targetFile.isFile()) {
            throw new IllegalArgumentException(targetFile.getName() + "不是文件");
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(targetFile));
        oos.writeObject(serializable);
        oos.flush();
        oos.close();
    }

    public static Object deserializeObject(File file) throws IOException, ClassNotFoundException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file.getName() + "不存在");
        }

        if (!file.isFile()) {
            throw new IllegalArgumentException(file.getName() + "不是文件");
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object object = ois.readObject();
        ois.close();
        return object;
    }


}
