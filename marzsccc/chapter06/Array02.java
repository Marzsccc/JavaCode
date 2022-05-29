package chapter06;

import java.util.Scanner;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 12:03:14
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 12:16:16
 * @FilePath     : \\chapter06\\chapter06.Array02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        /*
         * 数组的动态初始化  2种方式
         */
        double scores[] = new double[5];

        // 循环输入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素的值");
            scores[i] = sc.nextDouble();
        }
        sc.close();
        for (int j = 0; j < scores.length; j++) {
            System.out.print(scores[j] + " ");
        }

        // ---------先声明，后分配存储空间
        int a[]; // a[]是null 空指针
        if (scores[1] > 1) {
            a = new int[3];
        }
    }
}
