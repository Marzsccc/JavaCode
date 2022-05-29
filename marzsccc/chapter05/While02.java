package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-08 20:44:49
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-08 20:46:56
 * @FilePath     : \\chapter05\\chapter05.While02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class While02 {

    public static void main(String[] args) {
        // 1. 打印1-100之间所有能被3整除的数字
        // int start = 1;
        // int end = 100;
        // while (start <= end) {
        //     if (start % 3 == 0) {
        //         System.out.println("i=" + start);
        //     }
        //     start++;
        // }

        // 2. 打印40-200之间所有的偶数
        int start = 40;
        int end = 200;
        while (start <= end) {
            if (start % 2 == 0) {
                System.out.println("i=" + start);
            }
            start++;
        }
    }

}
