package com.thingtill.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a+=b; //a = a+b
        a-=b; //a = a-b


        System.out.println(a);

        //字符串连接符  + ， String

        System.out.println(""+a+b); //字符串在前 拼接

        System.out.println(a+b+""); //字符串在后 运算

    }
}
