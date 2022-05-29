package chapter05;
/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-12 20:49:11
 * 
 * @LastEditors  : Do not edit
 * 
 * @LastEditTime : 2022-04-12 20:50:14
 * 
 * @FilePath     : \\chapter05\\chapter05.Return01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class Return01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Return的作用");
                return; //在方法内表示跳出方法，在main中表示退出

            }
            System.out.println("for");
        }

    }
}