package chapter04;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 20:40:39
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 20:44:18
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.Switch02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Switch02 {
    public static void main(String[] args) {
        double score = 88.2;
        if (score >= 0 && score <= 100) {
            switch ((int) score / 60) {
                case 0:
                    System.out.println("合格");
                    break;
                case 1:
                    System.out.println("不合格");
                    break;
            }
        } else {
            System.out.println("输入有误,请输入0-100之间的数字");

        }

    }
}
