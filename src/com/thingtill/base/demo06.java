package com.thingtill.base;

public class demo06 {

    //类变量
    static double phone = 1306882;


    //属性：变量

    /*
    实例变量：从属于对象；方法外面，类里面；如果不初始化，默认值是 0 0.0
            布尔值：默认是false
            除了基本类型，其余都是 null
     */
    String name;
    int age;

    //main方法
    public static void main(String[] args) {

        //局部变量：必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型  变量名字 = new 类（）；
        demo06 test = new demo06();
        System.out.println(test.age);
        System.out.println(test.name);

        //类变量 staric
        System.out.println(phone);
    }

    //其他方法
    public void add(){

    }

}
