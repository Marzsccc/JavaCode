package chapter05;
/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 20:51:46
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-08 21:12:52
 * @FilePath     : \\chapter05\\chapter05.circle.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入循环次数：");
        int r = sc.nextInt();
        for (int i = 1; i < r + 1; i++) {
            System.out.println("你真 牛：" + i);
        }
        System.out.println("-------------");
        for (int i = 1; i <= r ; i++) {
            System.out.println("你真 牛：" + i);
        }
        sc.close();
    }
}
