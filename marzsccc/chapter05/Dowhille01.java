package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-08 20:48:34
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-08 20:50:45
 * @FilePath     : \\chapter05\\chapter05.Dowhille01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Dowhille01 {
    public static void main(String[] args) {

        // 注意do while 与 while 的区别 （先执行后判断）
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 10);
        System.out.println("循环结束");
    }
}
