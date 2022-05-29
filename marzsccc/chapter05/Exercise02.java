package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 21:16:08
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 21:23:32
 * @FilePath     : \\chapter05\\chapter05.Exercise02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Exercise02 {
    public static void main(String[] args) {

        /*
         * 判断水仙花数：一个 3 位数的 个位 十位 百位 的立方和等于本身
         * eg：153 = 1*1*1 + 5*5*5 + 3*3*3
         * 
         * 
         * 思路： 输入一个数， 得到其 个十百位 if 判断 立方和是否等于本身
         * 求 百位 n/100
         * 求 十位 n%100 /10
         * 求 个位 n % 100 %10
         */

        int n = 153;
        int bai = n / 100;
        int shi = n % 100 / 10;
        int ge = n % 100 % 10;// n % 10
        if (n == bai * bai * bai + shi * shi * shi + ge * ge * ge) {
            System.out.println("这个数是水仙花数");
        } else {
            System.out.println("这个数不是水仙花数");
        }
    }
}
