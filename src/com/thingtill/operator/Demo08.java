package com.thingtill.operator;

//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        // x ? y: z
        //如果x==true，则结果为y，否则为z

        int score = 40;
        String type = score<60 ?"Ok":"NO";
        System.out.println(type);
    }
}