package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 19:56:50
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 20:18:59
 * @FilePath     : \\chapter05\\chapter05.BreakExercise01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class BreakExercise01 {
    public static void main(String[] args) {

        // 1-100以内的数求和，求当 和 第一次大于20的当前数 for+break

        // for (int i = 1; i <= 100; i++) {
        // int sum = 0;
        // for (int j = 1; j <= i; j++) {
        // sum += j;
        // if (sum > 20) {
        // System.out.println("sum = " + sum);
        // System.out.println("i = " + i);
        // break;
        // }
        // }
        // }

        int sum = 0;
        int n = 0; // 记录当前数
        for(int i =0; i<=100; i++){
            sum += i;
            if(sum>20){
                System.out.println("sum = " + sum);
                // System.out.println("i = " + i);
                n = i;
                System.out.println("i = " + n);
                break;
            }
        }
    }
}
