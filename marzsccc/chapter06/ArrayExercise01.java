package chapter06;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 12:30:28
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 12:47:24
 * @FilePath     : \\chapter06\\chapter06.ArrayExercise01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

import java.util.Random;
import java.util.Arrays;
public class ArrayExercise01 {
    /*
     * 遍历数组求最大值
     * 
     * 
     * 分析：
     * 可以int chapter02.max = array[0];
     * 然后存储此时的下标
     * 循环比较 存最大的max和下标即可
     */
    public static void main(String[] args) {
        int array[] = new int[10];
        int max = 0;
        int index = 0;
        // 先赋值
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + i;
            // array[i] = random();
            max = array[0];
            if (max < array[i]) {
                max = array[i];
                index = i;
            }

        }
        System.out.println("该数组为" + Arrays.toString(array));
        System.out.println("最大值为:" + max + "最大值的下标为：" + index);
    }

}
