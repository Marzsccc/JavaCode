package chapter01;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-06 12:40:18
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-06 12:59:30
 * @FilePath     : \\chapter01\\variable02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class variable02 {
    // 编写变量的main方法
    public static void main(String[] args) {
        // 变量中+号使用
        System.out.println(100 + 98);// 198
        System.out.println("100" + 98);// 10098
        System.out.println(100 + 3 + "hello");// 103hello 从左到右执行
        System.out.println("hello" + 100 + 3);// hello1003
    }
}