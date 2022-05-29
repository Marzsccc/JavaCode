package chapter07;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-15 19:17:40
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-04-15 20:32:28
 * @FilePath     : \\chapter07\\chapter07.Method02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

 import java.util.Arrays;

public class Method02 {
    public static void main(String[] args) {

        int map[][] = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 1, 3 }, };
        // /*
        // * 遍历二维数组
        // *
        // */
        // for (int i = 0; i < map.length; i++) {
        // for (int j = 0; j < map[i].length; j++) {
        // System.out.print(map[i][j] + " ");
        // }
        // System.out.println();
        MyTools tool = new MyTools();
        tool.printArr(map);
        System.out.println();
        tool.printArr(map);
        System.out.println();
        tool.printArr(map);
        int a[] = tool.getSum1(1, 3);
        System.out.println(Arrays.toString(a));
    }
}

class MyTools {
    public void printArr(int[][] map) {
        // 遍历二维数组 并打印
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 1. 1个方法只能有一个返回值
    public int[] getSum1(int a, int b) {

        int res[] = new int[2];
        res[1] = a + b;
        res[2] = a / b;
        return res;
    }

    // 2. 返回类型可以使任意类型（基本类型和引用类型（数组和对象））
    public double getSum2(int a, int b) {
        double d1 = a * b;
        int n = 100;
        // return 1.1;//可以
        return n; // int ---> double 可以

    }

    // 3. 如果要求有返回类型 最后执行语句必须是return;
    // public int getSum3(int a, int b) {
    // double d1 = a * b;
    // int n = 100;
    // // return 1.1;//可以
    // return d1; //double ---> int 不可以
    // }

}
