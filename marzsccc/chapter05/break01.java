package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 19:45:14
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 19:49:34
 * @FilePath     : \\chapter05\\chapter05.break01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class break01 {

    public static void main(String[] args) {
        // 需求：使用循环 遍历到一个数 使用break跳出循环
        for(int i = 1; i < 10; i++) {
            if(i == 7) {
                break;
            }
            System.out.println("i = " + i);
        }
            
        }
}
