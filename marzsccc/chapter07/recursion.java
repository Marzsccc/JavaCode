package chapter07;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-16 16:47:12
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-04-18 14:21:35
 * @FilePath     : \\chapter07\\chapter07.recursion.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class recursion {
    public static void main(String[] argas) {
        T t1 = new T();
        t1.test(4);
    }
}

class T {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n="+n);
    }

}