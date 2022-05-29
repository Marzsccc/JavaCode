package chapter06;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 12:16:33
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 12:26:10
 * @FilePath     : \\chapter06\\chapter06.Array03.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Array03 {
    public static void main(String[] args) {
        /*
         * 数组的静态初始化 2种方式
         */
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        // 或者
        int b[] = new int[7];
        // b[1] = 1;
        // b[2] = 2;

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]=" + b[i]+" ");
        }
        System.out.println(" ");
        char c[] = new char[7];
        for (int i = 0; i < c.length; i++) {
            System.out.print("b[" + i + "]=" + c[i]+" ");
        }
    }
}
