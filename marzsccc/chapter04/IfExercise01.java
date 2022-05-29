package chapter04;
/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 19:42:36
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 19:47:25
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.IfExercise01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        // 输入2个double型变量，并判断第一个数大于10.0，第二个数小于20.0，打印两个数之和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个double型变量：");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num1 > 10.0 && num2 < 20.0) {
            System.out.println("两个数之和为：" + (num1 + num2));
        }else{
            System.out.println("输入有误");
        }

    }
}
