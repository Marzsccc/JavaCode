package chapter04;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 19:35:46
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 19:37:51
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.if01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        } 

    }
}
