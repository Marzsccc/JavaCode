package chapter07;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-04-15 14:48:53
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-04-15 14:57:37
 * @FilePath     : \\chapter07\\chapter07.PropertiesDetial.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class PropertiesDetial {

    public static void main(String[] args) {
        Person01 p1 = new Person01();
        System.out.println("\n打印信息");
        System.out.println("age=" + p1.age + " name=" + p1.name
                + " sal=" + p1.sal + " isPass=" + p1.isPass);

    }
}
 
class Person01 {
    //四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}