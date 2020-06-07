package com.thingtill.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a=12313211231L;
        double b=131.122;
        int c=500;
        short d=10;
        byte e=8;

        //只要有long（double）类型相加为long（double）类型，其余都是int类型
        System.out.println(a+c+d+e); //long
        System.out.println(b+c+d+e); //double
        System.out.println(c+d+e); //int
        System.out.println(d+e);   //int
    }
}
