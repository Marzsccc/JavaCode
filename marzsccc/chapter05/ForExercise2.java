package chapter05;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-08 20:08:58
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-08 20:20:06
 * @FilePath     : \\chapter05\\chapter05.ForExercise2.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class ForExercise2 {

    public static void main(String[] args) {

        /*
         * 0 + 5 = 5
         * 1 + 4 = 5
         * 2 + 3 = 5
         * 3 + 2 = 5
         * 4 + 1 = 5
         * 5 + 0 = 5
         */

        // 先死
        // int a = 5;
        // int b = 0;
        // for (int i = 0; i <= 5; i++) {
        // int c = a - i;
        // System.out.println(b + " + " + (a - b) + " = " + a);
        // b++;
        // }

        // 后活
        int a = 5;
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " + " + (a - i) + " = " + n);
        }
    }

}