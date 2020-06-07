package com.thingtill.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        double m=0;
        int s=0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            s = s+1;
            m = m+x;
        }
        System.out.println(m);
        System.out.println(m/s);


        scanner.close();
    }
}
