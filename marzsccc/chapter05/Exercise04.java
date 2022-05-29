package chapter05;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 21:38:02
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 21:43:42
 * @FilePath     : \\chapter05\\chapter05.Exercise04.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class Exercise04 {
    public static void main(String[] args) {
        /*
         * 求和： 1-1/2+1/3-1/4+1/5...1/100
         * 
         * 分析： 原式=(1/1)-(1/2)+(1/3)-(1/4)....
         * 分奇数和偶数
         * 小数用double 
         * 除法不能1 要用1.0 
         */
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += 1.0 / i; // 注意 不是 1/i
            } else {
                sum -= 1.0 / i;
            }

        }
        System.out.println("sum=" + sum);
    }
}