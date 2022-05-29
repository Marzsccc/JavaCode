package chapter02;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-28 13:55:00
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-03-28 14:14:33
 * @FilePath     : \\JavaCode\\chapter02\\chapter02.ScannerInput.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        /**
         * @Author: marzsccc
         * @intro: 接收用户输入
         * @param {*}
         * @return {*}
         */
        /**
         * 1.导入包
         * 2.创建Scanner对象
         * 3.接收用户输入
         */
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入name");
        String Name = myscanner.next();
        System.out.println("请输入age");
        int AGE = myscanner.nextInt();
        System.out.println("请输入gender");
        String Gender = myscanner.next();
        System.out.println("Name=" + Name + " age=" + AGE + "  Gender=" + Gender);
    }
}