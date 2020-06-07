package com.thingtill.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        //jdk7以上支持switch 字符串

        //反编译 java---class(字节码文件)---反编译IDEA

        String name = "中午";
        switch (name){
            case "早上":
                System.out.println("早上");
                break;
            case "中午":
                System.out.println("中午");
                break;
            default:
                System.out.println("未知");
        }

    }
}