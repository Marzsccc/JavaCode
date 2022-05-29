package chapter04;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 20:00:09
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 20:02:24
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.If02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class If02 {
    public static void main(String[] args) {
        boolean b = true;
        if (b = false) { // 编译不会报错，if（）中的条件判断为false则不会运行{}中的语句
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

    }
}
