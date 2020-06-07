package com.thingtill.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(2,3);

        printMax(1,2,10,5,6,8);
    }
    //可变参数,一个方法中只能指定一个，且必须是最后一个参数

    public void test(int... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
    }

    public static void printMax(double... numbers){
        if (numbers.length==0){
            System.out.println("No value");
            return;
        }
        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > res){
                res = numbers[i];
            }

        }
        System.out.println(res);

    }
}
