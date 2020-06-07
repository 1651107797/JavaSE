package com.thingtill.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //打印所有数组

        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays[i]);
        }

        //数组和
        int sum = 0;
        for (int i = 0; i <arrays.length ; i++) {
            sum += arrays[i];
        }
        System.out.println(sum);

        //数组中最大的元素
        int max = arrays[0];
        for (int i = 0; i <arrays.length ; i++) {
            if (arrays[i] > max){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}
