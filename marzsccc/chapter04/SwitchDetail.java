package chapter04;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-07 20:16:28
 * @LastEditors  : Do not edit
 * @LastEditTime : 2022-04-07 20:54:49
 * @FilePath     : \\JavaCode\\chapter04\\chapter04.SwitchDetail.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class SwitchDetail {
    public static void main(String[] args) {
        // 细节1
        // 表达式数据类型应和case后的常量类型保持一致
        // 或者可以自动转换为可以相互比较的类型（比如输入字符 常量是int）

        // 细节2
        // switch(表达式)中表达式的返回值必须是：
        // byte，short, int, char, enum(枚举), string

        // 细节3
        // case后面的值必须是常量(比如数字、字符)，而不能是变量

        // 细节4
        // default可以不写

        // 细节5
        // break用来执行完一个case后跳出switch语句
        // 如果不写break则从当前case一直往后执行

        char c = 'a'; // 这里改成 String c = "a";的话 后面case 可以用string
        char c2 = 'b';
        switch (c) {
            case 'a':
                System.out.println("a");
                break;
            // case 'b' + 1: // 可以，计算后仍是常量
            // System.out.println("b");
            // break;
            case 'c':
                System.out.println("c");
                break;
            // case 'hello': //这里不行，字符串无法强转字符
            // System.out.println("c");
            // break;
            // case '20': // 这里可以，字符可以强转int
            // System.out.println("20");
            // break;
            // case c2: //这里不行，case后面不能接变量
            // System.out.println("c");
            // break;
            default:
                System.out.println("d");
                break;

        }
    }

}
