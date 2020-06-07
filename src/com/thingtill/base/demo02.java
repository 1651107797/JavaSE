package com.thingtill.base;

public class demo02 {
    public static void main(String[] args) {
        //整数拓展： 进制  二进制0b 十进制 八进制 0  十六进制0x
        int i = 10;
        int i2 = 0b10;
        int i3 = 010;
        int i4 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        //浮点拓展：
        //float 离散 舍入误差 接近
        //double

        float f = 0.1f;
        double d = 0.1;
        System.out.println(f==d);

        float f1 = 21234532124f;
        float f2 = f1 + 1;
        System.out.println(f1==f2);

        //字符拓展
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println(c2);
        //编码 unicode表
        System.out.println((int) c1); //强转
        System.out.println((int) c2); //强转

        // U0000 UFFF
        char c3 = '\u0062';
        System.out.println(c3);

        //转义字符
        // \t 制表符
        // \n 换行

        System.out.println("sss\nwo");

        //布尔值拓展  if中默认为true
        boolean flag = true;
        if (flag){

        }
    }
}
