package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 21:26:39
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 21:34:13
 * @FilePath     : \\chapter05\\chapter05.Exercise03.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Exercise03 {
    public static void main(String[] args) {

        /*
         * 输出小写的a-z和大写的A-Z
         * 
         * 分析： 'b' = 'a' + 1 看ASC码表
         */
        int count = 0;
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + "");
            count++;
            if (count % 4 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        /*
         * 输出大写的Z-A
         * 
         * 分析： 'b' = 'a' + 1 看ASC码表
         */
        for (char c1 = 'Z'; c1 >= 'A'; c1--) {
            System.out.print(c1 + "");
            count++;
            if (count % 4 == 0) {
                System.out.println("");
            }

        }

    }
}
