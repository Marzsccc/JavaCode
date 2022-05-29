package chapter05;
/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-08 20:51:34
 * 
 * @LastEditors  : Do not edit
 * 
 * @LastEditTime : 2022-04-08 20:56:52
 * 
 * @FilePath     : \\chapter05\\chapter05.DowhileExercise02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class DowhileExercise02 {
    public static void main(String[] args) {
        // 统计1-200之间能被5整除但不能被3整除的数字
        int a = 1;
        int count = 0;
        do {
            if (a % 5 == 0 && a % 3 != 0) {
                System.out.println("a=" + a);
                count++;
            }
            a++;
        } while (a <= 200);

        System.out.println("count=" + count);
    }
}
