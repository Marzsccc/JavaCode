package chapter01;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-06 13:08:06
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-06 18:16:09
 * @FilePath     : \\chapter01\\intDetail.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class intDetail {
    /*
     * 1 bite = 8 bit 1 字节 = 8 位
     * long类型：8个字节*8位=64位
     * 
     */
    public static void main(String[] args) {
        // int的使用细节
        int a1 = 4;
        /*
         * int a2 = 5L; // 报错，因为int是4字节，5L是长整型 8字节，强行转换会有内容损失，因此报错(编译器从右到左)
         */
        long a3 = 5L;
        /*
         * java 的浮点型常量默认为double型（8字节），声明float型（4字节）常量需要加f或F
         */
        float a4 = 5.1F;
        double a5 = 6f; // 把float放到double中是可以的

        /*
         * java 通常用double，比float型更精确
         */
        double num1 = 2.1234567891;
        float num2 = 2.1234567891F;
        System.out.println(num1);// 2.1234567891
        System.out.println(num2);// 2.1234567 小数点后七位

        double num11 = 2.7;
        double num12 = 8.1 / 3;
        System.out.println(num11);// 2.7
        System.out.println(num12);// 接近2.7的一个数 2.6999999999999997
        // 注意！！经过计算后的数字不能这样判断相等
        if (num11 == num12) {
            System.out.println("相等");// 不会输出
        }

        /*
         * 判断两数相等的正确写法：相减在某个精度范围内
         */
        // 多行注释 ctrl+/
        if (Math.abs(num11 - num12) < 0.000001) {
            System.out.println("相等"); // 会输出
        }
        System.out.println(Math.abs(num11 - num12));// 4.440892098500626E-16
        

    }
}
