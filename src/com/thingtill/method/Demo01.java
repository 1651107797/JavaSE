package com.thingtill.method;

public class Demo01 {
    //mian方法
    public static void main(String[] args) {
        int sum = add(2, 3);
        System.out.println(sum);
        test();
    }

    //加法
    public static int add(int a,int b){
        return a+b;
    }

    //不返回
    public static void test() {
        int i = 0;
        while (i<100){
            i++;
            System.out.println(i);

            if (i==30){
                break;
            }
        }

    }
}
