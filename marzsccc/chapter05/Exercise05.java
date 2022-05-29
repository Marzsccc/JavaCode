package chapter05;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 21:45:13
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 21:54:45
 * @FilePath     : \\chapter05\\chapter05.Exercise05.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class Exercise05 {

    public static void main(String[] args) {

        /*
         * 求和： 1 + (1+2)+(1+2+3)+(1+2+3+4)...+(1+2+3+...+100)
         * 分析：
         * 第n项 的结尾是+n
         * 不涉及乘除，用int就行
         * 用个int sum
         * for循环遍历1-100
         */
        int sum = 0;
        int n = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            n += i; // 第n项
            sum += n;
            count++;
            System.out.print(n + " ");
            if (count % 5 == 0) {
                System.out.println(" ");
            }

        }
        System.out.println("---------");
        System.out.print(sum + " ");
        if (count % 5 == 0) {
            System.out.println(" ");
        }
    }
}