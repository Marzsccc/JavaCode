package chapter04;
/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 20:09:49
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 20:14:58
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.Switch01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)：");
        char c1 = sc.next().charAt(0);
        switch (c1) { // java中只要有值返回就是一个表达式
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c':
                System.out.println("c");
                break;
            case 'd':
                System.out.println("d");
                break;
            case 'e':
                System.out.println("e");
                break;
            case 'f':
                System.out.println("f");
                break;
            case 'g':
                System.out.println("g");
                break;
            default:
                System.out.println("输入错误");
                break;

        }

        System.out.println("switch执行完毕");
    }
}
