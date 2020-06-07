package com.thingtill.method;

public class Demo02 {
    public static void main(String[] args) {
        int max = max(1121, 5);
        double d_max = max(20.0,10.0);
        System.out.println(max);
        System.out.println(d_max);
    }

    public static int max(int num1, int num2) {
        if (num1 == num2 ) {
            return 0;
        }else {
            return num1 > num2 ? num1 : num2;
        }
    }
    //重载 参数个数不同或类型不同或排列顺序不同。。。返回类型可以相同
    public static double max(double num1, double num2) {
        if (num1 == num2 ) {
            return 0;
        }else {
            return num1 > num2 ? num1 : num2;
        }
    }

}

