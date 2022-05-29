package chapter05;
/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 20:21:14
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 20:42:38
 * @FilePath     : \\chapter05\\chapter05.BreakExercise02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        // 实现登录验证，3次机会，当用户名为丁真，密码 666 时 提示登陆成功
        // 否则提示还有几次机会

        // 思路分析
        // 1. 创建Scanner 对象接受用户输入
        // 2. 创建变量记录用户名和密码
        // 3. 创建变量记录用户登录次数
        // 4. 创建变量记录用户登录剩余次数
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        int chance = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            username = sc.next();
            System.out.println("请输入密码：");
            password = sc.next();
            // 字符串 比较 比较密码 "丁真".equals(name) [可以避免空指针，推荐使用]
            if (username.equals("丁真") && password.equals("666")) {
                System.out.println("登陆成功！");
                break;
            }else{
                chance--;
                System.out.println("你还有"+chance+"次登录机会");
            }
            sc.close();
        }

    }
}
