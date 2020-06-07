package com.thingtill.base;

public class demo04 {
    public static void main(String[] args) {
        //操作较大数值时溢出问题
        int a = 1000000000;
        int b = 20;
        int c = a*b;
        System.out.println(c); //-1474836480 计算的时候溢出了

        long c1 = a*b;
        System.out.println(c1); //默认是int，转换之前存在问题

        long c2 = a*((long)b);
        System.out.println(c2); //先把一个数转为long

    }
}
