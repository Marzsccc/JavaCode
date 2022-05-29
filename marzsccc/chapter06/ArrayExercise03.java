package chapter06;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 13:05:16
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 13:56:03
 * @FilePath     : \\chapter06\\chapter06.ArrayExercise03.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */



import java.util.Arrays;

public class ArrayExercise03 {
    /*
     * 数组反转
     * arr{1,2,3,4} -- arr{4,3,2,1}
     * 
     * 分析：
     * 下标用元素个数相减再减一即可
     * 
     */
    public static void main(String[] args) {
        /*
         * 用两个数组
         * 这叫做逆序赋值法
         */
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int b[] = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        System.out.println(Arrays.toString(b));
        // 另一种写法
        int a1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int b1[] = new int[a1.length];
        int index1 = 0;
        for (int i = a1.length - 1, j = 0; i >= 0; i--, j++) {
            b1[j] = a1[i];
        }
        System.out.println(Arrays.toString(b1));

        // aaa =new getNewArray();
        // aaa;
        // static getNewArray() {
        // /*
        // * 用1个数组 1个变量
        // *
        // */
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int temp = 0;
        // int lens = arr.length;
        // for (int i = 0; i < lens / 2; i++) {
        // temp = arr[lens - 1 - i];
        // arr[lens - 1 - i] = arr[i];
        // arr[i] = temp;
        // }
        // System.out.println(Arrays.toString(arr));

        // }
    }

    // public static void getNewArray() {
    // /*
    // * 用1个数组 1个变量
    // *
    // */
    // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    // int temp = 0;
    // int lens = arr.length;
    // for (int i = 0; i < lens / 2; i++) {
    // temp = arr[lens - 1 - i];
    // arr[lens - 1 - i] = arr[i];
    // arr[i] = temp;
    // }
    // System.out.println(Arrays.toString(arr));

    // }

}