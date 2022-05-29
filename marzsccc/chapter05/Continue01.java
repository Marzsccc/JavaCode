package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 20:37:06
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 20:41:57
 * @FilePath     : \\chapter05\\chapter05.Continue01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Continue01 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 3) {
                continue;
            }
            System.out.println("i=" + i);

        }
    }
}
