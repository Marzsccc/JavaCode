package chapter01;/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-03-06 20:22:59
 * 
 * @LastEditors  : marzsccc
 * 
 * @LastEditTime : 2022-03-06 20:28:43
 * 
 * @FilePath     : \\chapter01\\forceConvert.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class forceConvert {
    public static void main(String[] args) {
        int n1 = (int) 1.9;
        System.out.println(n1); // 精度损失

        int j = 10000;
        byte b1 = (byte) j;
        System.out.println(b1);// 数据溢出
    }
}
