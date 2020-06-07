package com.thingtill.struct;

import java.util.Scanner;

//if
public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        String s = scanner.nextLine();

        //if单判断
        if (s.equals("ufo")){
            System.out.println("相等");
        }
        System.out.println("1");

        scanner.close();
    }
}
