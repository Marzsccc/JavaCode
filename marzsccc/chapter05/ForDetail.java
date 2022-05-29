package chapter05;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 20:59:49
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 21:11:43
 * @FilePath     : \\JavaCode\\chapter05\\chapter05.ForDetail.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class ForDetail {
    public static void main(String[] args) {

        // 万一需要用到循环次数
        // 有另一种for的写法
        // for (; 循环判断条件;)

        // int i = 0; // 循环变量初始化 放在外面
        // for (; i < 10;) {
        // System.out.println("i = " + i);
        // i++;
        // }

        // for (;;) { // 循环条件为true 表示无限循环
        // System.out.println("xx" );
        // }
        int count = 3;
        for (int i = 0, j = 3; i < count; i++, j += 1) {
            System.out.println("i = " + i + " j = " + j);
        }

    }
}