package chapter02;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-06 15:51:36
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-06 20:15:34
 * @FilePath     : \\JavaCode\\chapter02\\chapter02.BitOperator2.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class BitOperator2 {
    public static void main(String[] args) {
        // 位运算的本质 实际上就是 左移乘以2 右移除以2
        System.out.println(1 >> 2); // 1 /2 /2 =0
        System.out.println(1 << 2); // 1 *2 *2 =4
        System.out.println(4 << 3); // 4 * 2 *2 *2 =32
        System.out.println(15 >> 2); // 15 /2 /2 =3
        // a % b = a - int(a) / b * b
        System.out.println(-10.5 % 3); // -10.5 - int(-10.5 ) / 3 * 3 = -1.5
        // 注意 有小数参与的结果是一个近似值
        // 所以不能用 == 判断 一定要用一个插值在某个范围来确定
        int i = 66;
        System.out.println(++i + i); // 67+67
    }
}
