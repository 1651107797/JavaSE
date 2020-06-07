package com.thingtill.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化: 创建+赋值
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a[1]);

        //动态初始化
        int[] b = new int[10];
        b[0] = 2;
        System.out.println(b[1]);
    }
}
