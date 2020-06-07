package com.thingtill.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        int a = 1;
        while (a<10){
            for (int i = 1; i <= a; i++) {
                int b = a*i;
                System.out.print(i + "×" + a + "=" +b + "\t");
            }
            System.out.print("\n");
            a+=1;
        }
    }
}
