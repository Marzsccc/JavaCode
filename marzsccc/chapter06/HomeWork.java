package chapter06;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 20:29:54
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 21:10:51
 * @FilePath     : \\chapter06\\chapter06.HomeWork.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        /*
         * 
         * 已知一个升序数组，要求插入一个元素，并依然保持升序
         * [10,12,45,90],插入23，变为[10,12,23,45,90]
         * 
         * 分析：定位+扩容
         * 应该有两种办法
         * 1.先定位（遍历比大小找index），再扩容（新数组拷贝重新指向）
         * 2.先扩容（新数组拷贝重新指向），再定位（重排序）
         */

        // // 第一种 先定位，再扩容
        // int arr[] = { 10, 12, 45, 90 };
        // int num = 118;
        // int arrLens = arr.length;
        // int arrNew[] = new int[arrLens + 1];
        // int index = -1;

        // System.out.println("老数组：" + Arrays.toString(arr));
        // // 遍历循环找到插入位置的index
        // for (int i = 0; i < arrLens; i++) {
        // if (num <= arr[i]) {
        // index = i;
        // break;
        // }
        // }
        // if (index == -1) {
        // index = arrLens;
        // }
        // System.out.println("index：" + index);
        // // 扩容
        // for (int i = 0, j = 0; i < arrLens + 1; i++) {
        // if (i != index) {
        // arrNew[i] = arr[j];
        // j++;
        // } else {
        // arrNew[i] = num;
        // }
        // }
        // arr = arrNew;
        // System.out.println("新的数组为：" + Arrays.toString(arr));

        // 第二种 先扩容，再定位
        int arr[] = { 10, 12, 45, 90 };
        int num = 22;
        int arrLens = arr.length;
        int arrNew[] = new int[arrLens + 1];
        int index = -1;

        int lun = arr.length -1;
        int temp = -1;

        System.out.println("老数组：" + Arrays.toString(arr));
        // 扩容
        for (int i = 0, j = 0; i < arrLens + 1; i++) {
            if (i != arrLens) {
                arrNew[i] = arr[i];
            } else {
                arrNew[i] = num;
            }
        }
        arr = arrNew;
        System.out.println("新的数组为：" + Arrays.toString(arr));
        // 排序 比如冒泡
        for (int i = 0; i < lun + 1; i++) { // 后写外层循环 排序的轮数
            for (int j = 0; j < lun - i; j++) { // 先写内层循环 排序执行的次数
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
