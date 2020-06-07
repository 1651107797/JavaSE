package com.thingtill.struct;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        //先执行do再判断while
        do {
            b = b + i;
            i++;
        }while (i<=100);
        System.out.println(b);
    }
}
