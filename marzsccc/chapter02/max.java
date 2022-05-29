package chapter02;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-10 21:27:15
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-10 21:30:51
 * @FilePath     : \\chapter02\\chapter02.max.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class max {
    public static void main (String[] args){

        int n1 = 2000;
        int n2 = 300;
        int n3 = 100;
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2? n1 : n2) : n3;
        System.out.println("chapter02.max=" + max);
    }
}