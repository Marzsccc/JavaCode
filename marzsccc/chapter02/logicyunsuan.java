package chapter02;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-10 20:46:41
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-10 21:15:37
 * @FilePath     : \\chapter02\\chapter02.logicyunsuan.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class logicyunsuan {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        if (x++ == 6 & ++y == 6) {
            x = 11;
        }
        System.out.println("x=" + x + "," + "Y=" + y);
        // int age = 50;
        // if (age > 50 && age < 100) {
        // System.out.println("look100");
        // }

    }
}
