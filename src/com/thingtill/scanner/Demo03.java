package com.thingtill.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int i = 0;
        //float f = 0.0f;

        System.out.println("input int:");

        if (scanner.hasNextInt()){
            int i = scanner.nextInt();
            System.out.println("int:"+ i);
        }else {
            System.out.println("erroe type not int ");
        }

        System.out.println("input float");
        if (scanner.hasNextFloat()){
            float f = scanner.nextFloat();
            System.out.println("float:"+f);
        }else {
            System.out.println("error type not float");
        }

        scanner.close();
    }
}
