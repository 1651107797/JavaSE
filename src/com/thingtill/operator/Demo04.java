package com.thingtill.operator;

public class Demo04 {
    public static void main(String[] args) {
        // ++ -- 自增 自减
        int a=3;
        int b=a++; // 先赋值，再自增
        int c=++a; // 先自增，再赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算 2^3
        double d = Math.pow(2,3);
        System.out.println(d);
    }
}
