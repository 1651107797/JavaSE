package com.thingtill.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        int a = scanner.nextInt();

        if (a>60){
            System.out.println("大于60");
        } else {
            System.out.println("小于等于60");
        }

        scanner.close();
    }
}
