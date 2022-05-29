package chapter05;

/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-08 21:11:31
 * 
 * @LastEditors  : Do not edit
 * 
 * @LastEditTime : 2022-04-12 19:38:26
 * 
 * @FilePath     : \\chapter05\\chapter05.PrintStar.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class PrintStar {
    public static void main(String[] args) {

        // 打印星星

        // for (int i = 1; i < 5; i++) { // i表示层数
        // // 打印空格
        // for (int K = 1; K <= 5 - i; K++) {
        // System.out.print(" ");
        // }
        // // 打印星星
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print(" ");
        // } // 打印空格
        // System.out.println();
        // }
        int total_level = 5;
        for (int i = 1; i <= total_level; i++) { // i表示层数
            // 打印空格
            for (int K = 1; K <= total_level - i; K++) {
                System.out.print(" ");
            }
            // 打印星星
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == total_level) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            } // 打印空格
            System.out.println();
        }

    }

}