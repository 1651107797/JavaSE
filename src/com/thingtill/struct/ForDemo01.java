package com.thingtill.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1; //初始值

        while (a<=100){  //条件判断
            System.out.println(a);
            a+=2;        //迭代
        }
        System.out.println("while结束");
        //for循环 初始值；条件；迭代
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("for结束");

        //死循环
        for (; ; ) {

        }
    }
}