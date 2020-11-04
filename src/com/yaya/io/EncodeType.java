package com.yaya.io;

import java.io.UnsupportedEncodingException;

public class EncodeType {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "杨洋Google";
        byte[] bytes = name.getBytes("gbk");
        for (Byte b : bytes) {
//            System.out.println(Integer.toHexString(b & 0xff));
        }

        int i = -10;
        int i1 = 10;
        double d = 10.3;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Double.toHexString(d));
    }

    /*
    不同的编码下英文和汉子所占用的字节数不一样。
    例如：gbk中英文栈一个字节，汉子占两个字节
    utf-8中英文栈一个字节，汉子占三个字节
    utf-16be中，英文和汉子都占两个字节

    字节和位数：
    bit是位，一个字节由8位。即1byte=8bit，byte是计算机存储的基本单位
    int 32bit 4字节 -2的31次方到2的31次方-1
    short 16bit 2字节 -2的15次方到2的15次方-1
    long 64bit 8字节 -2的63次方到2的63次方-1
    float 32bit 4字节
    double 64bit 8字节

    原码，反码和补码
    原码：一个整数，按照绝对值大小转换成二进制数，称为原码。
    反码：正数的反码是它本身；
        负数的反码是在其原码上，符号位不变，其余各个位置取反，取反的操作指，原为1，变0；原为0，变1；
    补码：正数的补码就是其本身
        负数的补码是符号位不变，其他各位取反后加1。

    机器数和真值
    机器数：一个数在计算机中的二进制表示形式，叫做这个数的机器数。机器数是带符号的，在计算机中用一个数的最高位存放符号，
        正数为0，负数为1.例如3=00000011，-3=10000011，这是机器数
    真值：不带符号位的机器数对应的真正数值称为机器数的真值。
    二进制中负数以其正值的补码形式表达


    为什么基本类型的范围上负数比正数大一
    因为在计算机进行读取二进制数字时，只会读取它的补码，不会读原码。 以8位为例子。0的表示方法有00000000和10000000，一个为0一个为-0，
    第一位表示符号，所以同意认为10000000为-128，而不是-0，10000000没有反码和原码，这是补码。

    电脑用补码计算的原因是：犹如时钟，9点退3个小时和9点前进9个小时的效果是一样的。负数的原码的补码加上原码就是最大值。
     */
}
