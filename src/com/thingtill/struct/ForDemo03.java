package com.thingtill.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //1000中5的整数，每输出3个换行
        for (int i = 0; i <= 1000; i++) {
            if (i%5 == 0){
                System.out.print(i+"\t");
            }
            if (i%15 == 0){
                //System.out.println();
                System.out.print("\n");
            }

        }

        //print 输出后会换行
        //println 输出后不会换行
    }
}
