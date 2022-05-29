package chapter07;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-18 19:02:35
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-04-23 10:42:22
 * @FilePath     : \\chapter07\\recursionExercise01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class RecursionExercise01 {

    public static void main(String[] args) {
        T02 T1 = new T02();
        int number = 7;
        int n = T1.fibonacci(number);
        System.out.print("当n="+number+"时，对应的斐波那契数=" + n);
    }
}

class T02 {
    /*
     * 求斐波那契数 1,1,2,3,5,8,11
     * 分析：
     * 1. 当n=1, y=1；
     * 2. 当n=2, y=1；
     * 3. 当n>=3, y=前两数之和；
     * 
     */

    public int fibonacci(int n) {
        if (n >= 1) { /*条件判断取值是否符合要求*/
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2); /*递归求解*/
            }
        } else {
            System.out.print("请输入正确的数字");
            return -1;
        }
    }
}