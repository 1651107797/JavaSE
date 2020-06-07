package com.thingtill.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        int a = 0; //奇数
        int b = 0; //偶数

        for (int i = 0; i <= 100; i++) {
            if (i%2 !=0){
                a+=i;
            }else {
                b += i;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
