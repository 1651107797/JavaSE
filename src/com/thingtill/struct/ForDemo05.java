package com.thingtill.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("=========");

        //遍历数组的元素
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
