package chapter05.shuzu;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-28 20:55:31
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class StringBuilder1 {
    public static void main(String[] args){


        method(); //625 毫秒 之所以慢是因为使用+号对字符串进行拼接在堆中开了多个堆内存，一个加号就开一个StringBuilder，然后再自动调用toString方法

         //StringBuilder  4毫秒
        long start = System.currentTimeMillis();//获取毫秒值
        java.lang.StringBuilder sB = new java.lang.StringBuilder();
        for (int i = 0; i <= 50000 ; i++) {
            sB.append(i);
        }
        System.out.println(sB);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void method() {
        long start = System.currentTimeMillis();//获取毫秒值
        String s = "";
        for (int i = 0; i <= 50000 ; i++) {
            s +=i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
