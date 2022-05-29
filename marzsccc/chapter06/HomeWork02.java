package chapter06;
/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-13 21:14:11
 * 
 * @LastEditors  : Do not edit
 * 
 * @LastEditTime : 2022-04-13 21:38:42
 * 
 * @FilePath     : \\chapter06\\chapter06.HomeWork02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Arrays;

public class HomeWork02 {
    public static void main(String[] args) {
        /*
         * 随机成成10个整数（1-100）保存到数组，
         * 倒序打印，求平均值，最大值和最大值的下标
         * 查找里面是否有8
         * 
         */
        int arr[] = new int[10];
        double total = 0.0;
        double avg = 0.0;
        int max = -1;
        int index = -1;
        boolean findnum = false;
        // 随机10个整数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("随机数组arr=" + Arrays.toString(arr));
        // 倒序打印
        System.out.print("倒序打印数组arr=" + "[");
        for (int i = arr.length - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 求平均值，最大值，及最大值的下标
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        avg = total / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8) {
                findnum = true;
                break;
            }
        }
        System.out.println("平均值=" + avg);
        System.out.println("最大值=" + max);
        System.out.println("最大值的下标=" + index);
        if (findnum == true) {
            System.out.println("有8");
        } else {
            System.out.println("无8");
        }
        //

    }
}