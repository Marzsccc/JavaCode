package chapter07;/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-13 21:50:01
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-04-15 21:27:13
 * @FilePath     : \\chapter07\\chapter07.类和对象.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */

public class 类和对象 {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "小花";
        cat1.age = 10;
        cat1.color = "黑色";

        // 栈 堆 方法区
        /*
         * 栈 一半存放基本数据类型（局部变量）
         * 堆 存放对象
         * 方法区 常量池（常量，比如字符串） 类加载信息
         * 
         * java 创建对象的流程简单分析
         * 
         * chapter07.Person p = new chapter07.Person();
         * p.name = "jack";
         * p.age = 10;
         * 
         * 1. 先加载Person类信息（属性和方法信息 ，当程序多次调用类时只加载一次）
         * 2. 在堆中分配空间 进行默认初始化 int 0 string null boolean false ，地址指向对象
         * 3. 进行指定初始化(age = 10 name =jack)
         */
        // Cat cat; // 声明对象 栈 中 cat对象名 指向null
        // cat = new Cat(); //堆中 出现了对象，其地址再指向cat

    }

    static class Cat {
        String name;
        int age;
        String color;
    }

}

class Car {
    // protected 访问修饰符
    /*
     * 访问修饰符共有四种： puvblic, protected, 默认, private
     */
    protected String name; // 属性,成员变量，字段，field
    double price;
    String color;
    String[] master;

}