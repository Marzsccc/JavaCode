package chapter07;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-18 19:02:35
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-04-23 12:29:06
 * @FilePath     : \\chapter07\\chapter07.RecursionExercise02.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class RecursionExercise02 {

    public static void main(String[] args) {
        TR1 T1 = new TR1();
        int number = 7;
        int n = T1.peach(number);
        System.out.print("当n=" + number + "时，对应的桃子数=" + n);
    }
}

class TR1 {
    /*
     * 求猴子吃桃子问题 一堆桃子 猴子第一天吃一半，再多吃1个，以后每天都是吃其中的一半再多吃一个
     * 到第10天想再吃时，发现只有一个桃子了。求最初有几个桃子？
     * 分析：
     * 1. 当n=10, y=1；求n=1，y=？
     * 2. y_{n+1} = y_{n} - y_{n}/2 - 1  
     * 3. 当n>=3, y=前两数之和； 
     * 
     */

    public int houzichitao(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return houzichitao(n - 1) + houzichitao(n - 2);
            }
        } else {
            System.out.print("请输入正确的数字");
            return -1;
        }
    }


    public int peach(int day){
        if(day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (peach(day + 1) + 1) * 2;
        }else{
            System.out.println("day在1-10之间");
            return -1;
        }
    }
}
