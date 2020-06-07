package com.thingtill.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //case穿透，switch匹配一个具体的值
        char a = '3';

        switch (a){
            case 'C':
                System.out.println("CCC");
                break; //可选
            case 'D':
                System.out.println("DDD");
            case 'E':
                System.out.println("EEE");
            case 'F':
                System.out.println("FFF");
            case 'G':
                System.out.println("GGG");
            default:  //可选
                System.out.println("000");
        }

    }
}
