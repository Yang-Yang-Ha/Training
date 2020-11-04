package com.yaya.io;

/*
File类用于表示文件（目录）
File类只用于表示文件（目录）的信息（名称大小等），不能用于文件内容的访问

File直接新建文件，写文件名，默认路径为项目根目录。

File.mkdir 和File.mkdirs的区别是mkdir创建文件夹时如果父目录不存在，那么将创建失败，
mkdirs如果父目录不存在，将先创建父目录，再创建最终的目录。
 */

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileMain {

    public static void main(String[] args) throws IOException {
        File file = new File("src" + File.separator
                + "com" + File.separator
                + "yaya" + File.separator
                /*+ "io" + File.separator
                + "Generate.txt"*/);
/*        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile().getAbsolutePath());
        if (!file.exists()) {
            try {
                boolean isCreate = file.createNewFile();
                System.out.println("是否新建成功：" + isCreate);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            boolean isDelete = file.delete();
            System.out.println("是否删除成功：" + isDelete);
        }*/

        List<File> files = FileUtils.listDirectory(file);
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
    }


}
