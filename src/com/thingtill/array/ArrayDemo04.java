package com.thingtill.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        ////for-Each循环 没有下标
        //for (int array : arrays) {
        //    System.out.println(array);
        //}

        //print(arrays);

        int[]res = reverse(arrays);
        print(res);
    }
    //打印数组 数组作为方法传入
    public static void print(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    //反转数组1 数组作为返回值
    //public static int[] reverse(int[] arrays){
    //    int[] res = new int[arrays.length];
    //    for (int i = arrays.length - 1; i >= 0; i--) {
    //        res[(arrays.length - 1) - i]=arrays[i];
    //    }
    //    return res;
    //}

    //反转数组2
    public static int[] reverse(int[] arrays){
        int res[]=new int[arrays.length];
        for (int i = arrays.length-1,j=0; i >= 0; i--,j++) {
            res[j]= arrays[i];
        }return res;
    }

}
