package chapter05;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 21:13:20
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-08 20:07:00
 * @FilePath     : \\chapter05\\chapter05.ForExercise.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class ForExercise {
    public static void main(String[] args) {
        // 打印1~100之间所有9的倍数的整数，统计个数及总和
        // 这里学习两个中啊哟的编程思想
        // 1. 化繁为简：将复杂的需求拆解成简单的需求，逐步完成
        // 2. 先死后活：先考虑固定的值，然后转成可以灵活变化的值

        // int count = 0; // 统计9的倍数的个数
        // int sum = 0; // 统计9的倍数的总和
        // for (int i = 0; i <= 100; i++) {
        // if (i % 9 == 0) {
        // count++;
        // sum += i;
        // System.out.println("i=" + i);
        // }

        // }
        // System.out.println("count=" + count);
        // System.out.println("sum=" + sum);

        // 打印start~end之间所有9的倍数的整数，统计个数及总和
        // int count = 0; // 统计9的倍数的个数
        // int sum = 0; // 统计9的倍数的总和
        // int start = 1; // 开始的值
        // int end = 100; // 结束的值
        // for (int i = start; i <= end; i++) {
        // if (i % 9 == 0) {
        // count++;
        // sum += i;
        // System.out.println("i=" + i);
        // }

        // }
        // System.out.println("count=" + count);
        // System.out.println("sum=" + sum);

        // 打印start~end之间所有t的倍数的整数，统计个数及总和
        int count = 0; // 统计9的倍数的个数
        int sum = 0; // 统计9的倍数的总和
        int start = 1; // 开始的值
        int end = 100; // 结束的值
        int t = 10; // 倍数
        for (int i = start; i <= end; i++) {
            if (i % t == 0) {
                count++;
                sum += i;
                System.out.println("i=" + i);
            }

        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }

}
