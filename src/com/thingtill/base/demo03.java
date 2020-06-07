package com.thingtill.base;

public class demo03 {
    public static void main(String[] args) {
    /*
        低-------------------------------高
        byte,short,char → int → float → double
     */

        //强制转换 （类型）变量名 高--低
        int i = 128;
        byte b = (byte) i; //内存溢出 byte范围 -128 - 127
        System.out.println(i);
        System.out.println(b);

        //自动转换 低--高
        double c = i;
        System.out.println(c);
    }
}
