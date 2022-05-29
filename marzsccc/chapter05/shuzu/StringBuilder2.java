package chapter05.shuzu;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-28 21:06:42
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class StringBuilder2 {

    public static void main(String[] args) {
        //public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        java.lang.StringBuilder sb = new  java.lang.StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

        //public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
        java.lang.StringBuilder sb2 = new  java.lang.StringBuilder("hello");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());
    }

}
