package chapter06;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 12:49:52
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-13 13:00:59
 * @FilePath     : \\chapter06\\chapter06.ArrayExercise02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class ArrayExercise02 {
    /*
     * 数组的传递赋值
     * 
     * 
     * 分析：
     * int 是值拷贝，array是引用赋值(传递的是地址)
     * 
     */
    public static void main(String[] args) {
    int n1 = 5;
    int n2 = n1;
    n2 = 12; // n2改变不影响 n1 （值拷贝）

    int arr1[] = { 1, 2, 3 };
    int arr2[] = arr1;
    arr1[0]=3; // n2改变影响 n1 （引用拷贝）
    }
}
