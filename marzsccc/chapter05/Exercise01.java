package chapter05;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-12 20:53:18
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-12 21:15:01
 * @FilePath     : \\chapter05\\chapter05.Exercise01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Exercise01 {
    public static void main(String[] args) {

        // 某人有100，000元 ，每经过以此路口，需要缴费，规则如下
        // 当现金 > 50000时 ,每次交5%
        // 当现金 < 50000时，每次交1000
        // 计算该人可以经过多少次路口 ，要求 使用while +break

        // 分析： 分情况 > 50000 ； 50000<money >1000 ; <1000
        double money = 100000;
        int k = 0;
        while (true) {
            if (money > 50000) {
                money *= 0.95;
                k++;
            } else if (money > 1000) {
                money -= 1000;
                k++;
            } else {
                break;
            }

        }
        System.out.println("该用户可经过路口：" + k + "次");
        System.out.println("该用户还剩：" + money + "元");
    }
}
