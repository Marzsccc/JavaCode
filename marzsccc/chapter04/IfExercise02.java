package chapter04;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 19:48:10
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 19:49:31
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.IfExercise02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

import java.util.Scanner;

public class IfExercise02 {
    public static void main(String[] args) {
        // 输入1个int型变量，并判断是否为闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int num1 = sc.nextInt();
        if (num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0) {
            System.out.println(num1 + "是闰年");
        } else {
            System.out.println(num1 + "不是闰年");
        }

    }
}
