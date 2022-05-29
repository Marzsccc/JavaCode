package chapter01;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-06 18:16:20
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-06 18:22:49
 * @FilePath     : \\chapter01\\charDetal.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class charDetal {

    public static void main(String[] args) {

        /*
         * 在java中，char的本质是一个整数，在输出时是unicode码对应的字符
         * 输出数字时使用(int)字符
         */

        char c1 = 97;
        System.out.println(c1);// a

        char c2 = 'a';
        System.out.println((int) c2); // 输出'a'对应的数字

        char c3 = '韩';
        System.out.println((int) c3);// 输出'韩'对应的数字

        char c4 = 38889;
        System.out.println(c4);// 输出3889对应的字符

        //char 是可以运算的，相当于一个unicode数字。
        System.out.println('a' + 10);// 输出107
    }

}
