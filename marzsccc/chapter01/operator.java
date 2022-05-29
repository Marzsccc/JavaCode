package chapter01;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-06 21:35:17
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-06 21:39:38
 * @FilePath     : \\chapter01\\operator.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class operator {
    public static void main(String[] args) {
        // 取模在java中的本质是一个公式： a % b = a - a/b *b
        // 10 % 3 = 10 - 10/3 * 3 = 10 - 9 = 1
        // -10 % 3 = (-10) - (-10) / 3 * 3 = -10 + 9 = -1
        // 10 % -3 = 10 - 10/(-3) * (-3) = 10 - 9 = 1
        //
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);

    }
}
