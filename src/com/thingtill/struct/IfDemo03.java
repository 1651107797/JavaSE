package com.thingtill.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");

        float a = scanner.nextFloat();

        if (a == 100){
            System.out.println("100");
        }else if (a>=90 && a<100){
            System.out.println("90-99");
        }else if (a>=80 && a<100){
            System.out.println("80-89");
        }else if (a>=60 && a<100){
            System.out.println("60-79");
        }else if (a<60 && a>=0){
            System.out.println("0-59");
        }else {
            System.out.println("数据错误");
        }
    }
}
