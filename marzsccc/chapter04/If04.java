package chapter04;
/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 19:53:10
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 19:59:51
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.If04.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你滴分数：");
        double grade = sc.nextDouble();
        if (grade >= 1 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("优秀");
            } else if (grade >= 80) {
                System.out.println("良好");
            } else if (grade >= 70) {
                System.out.println("中等");
            } else if (grade >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }

        } else {
            System.out.println("输入有误");
        }

    }

}
