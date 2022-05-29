package chapter06;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 14:36:41
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 20:05:37
 * @FilePath     : \\chapter06\\chapter06.TwoDimensionalArray01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

import java.util.Arrays;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        /*
            1  
            2 2
            3 3 3
        */
        int arr[][] = new int[3][];// 创建二维数组，只确定一维数组的个数
        for (int i = 0; i < arr.length; i++) {
            // 给每一个一维数组开辟内存空间，如果没new 那么arr[i]就是一个null
            arr[i] = new int[i + 1];
            // 遍历一维数组，并赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }

        }
        // 比那里 arr 输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    } 
}
