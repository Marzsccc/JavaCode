package chapter04;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-06 21:35:17
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-06 22:25:26
 * @FilePath     : \\chapter04\\chapter04.oper1.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class oper1 {
    public static void main(String[] args) {
        /*
         * & 和 &&的区别是 &需要算式两边执行完在判断
         * &&一旦判断第一个不满足条件就不执行了
         * 
         */
        int age = 33;
        int a = 4;
        int b = 9;
        if (age > 20 & age > 90) {
            System.out.println("ok3000");
        }
        if (a < 1 && ++b < 50) {
            System.out.println("a=" + a + "b=" + b);
        }

    }
}
