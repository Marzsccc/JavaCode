package chapter06;

import java.util.Arrays;

/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-13 13:44:38
 * 
 * @LastEditors  : Do not edit
 * 
 * @LastEditTime : 2022-04-13 13:50:51
 * 
 * @FilePath     : \\chapter06\\chapter06.ArrayAdd.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Arrays;

public class ArrayAdd {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        System.out.println("arr=" + Arrays.toString(arr));

    }
}