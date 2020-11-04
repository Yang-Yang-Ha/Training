package com.yaya.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
列出File的一些常用操作比如过滤、遍历等功能。
 */
public class FileUtils {

    /**
     * 列出指定目录下（包括子目录）的所有文件
     *
     * @param dir 指定目录
     * @throws IOException 读取文件出错
     */
    public static List<File> listDirectory(File dir) throws IOException {

        List<File> subFiles = new ArrayList<>();

        if (!dir.exists()) {
            throw new IllegalArgumentException(dir + "不存在");
        }

        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }

        File[] files = dir.listFiles();
        if (files != null) {
            if (files.length > 0) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        File[] files1 = file.listFiles();
                        if (files1 != null && files1.length > 0)
                            subFiles.addAll(listDirectory(file));
                        else
                            subFiles.add(file);
                    } else {
                        subFiles.add(file);
                    }
                }
            }
        }
        return subFiles;
    }

}
