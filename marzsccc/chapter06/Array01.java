package chapter06;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 11:51:38
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 12:05:16
 * @FilePath     : \\chapter06\\chapter06.Array01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class Array01 {

    public static void main(String[] args) {
        /*
         * 数组的快速入门 
         * double[] 表示 double类型的数组
         * 类似int[] string[] char[] ....
         */

        double[] hens = { 3, 5, 1, 3.4, 2, 50 };
        // 遍历数组 hens[下标] 下标从0开始编号
        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) { // for循环遍历数组时，由于数组下标从0开始，所以一定是i=0，然后判断条件使用 <元素个数 而不使用<= 更符合实际
            System.out.println("第" + (i + 1) + "个元素的值:" + hens[i]);
            totalWeight += i;
        }
        System.out.println("总体重=" + totalWeight + "平均体重=" + totalWeight / 6.0);
        System.out.println("总体重=" + totalWeight + "平均体重=" + totalWeight / hens.length);
    }
}