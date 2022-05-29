package chapter07;

/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-15 15:32:59
 * 
 * @LastEditors  : marzsccc
 * 
 * @LastEditTime : 2022-04-16 16:29:37
 * 
 * @FilePath     : \\chapter07\\chapter07.Method01.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "xxx";
        p1.Speak();
        p1.Calculate(100);
        /*
         * 方法调用小结
         * 1. 当程序执行到方法时，就会开辟一个独立栈空间
         * 2. 当方法执行完毕时，或者执行到return语句，就会返回
         * 3. 返回到调用方法的地方
         * 4. 返回后，继续执行方法后面的代码
         * 5. 当main方法(栈)执行完毕，整个程序退出
         */
        int sum = p1.getSum(10, 20);
        System.out.print("sum=" + sum);
        Person p= new Person();
        p.name = "milan";
        p.age = 100;
        Mytools tools = new Mytools();
        Person p2 = tools.copyPerson(p);
    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;

    /*
     * 方法（成员方法）
     * 
     * 1. public 表示该方法为公开
     * 2. void 表示 方法没有返回值 int 表示返回int值
     * 3. speak 方法名
     * 4.（int a,int b） 方法的形参
     */
    public void Speak() {
        System.out.println("????");
    }

    public void Calculate(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        System.out.print("sum=" + sum);
    }

    public int getSum(int a, int b) {
        int res = a + b;
        return res;
    }
}

class Mytools {

    /*
     * 编写一个方法copyPerson，复制一个Person对象，返回复制的对象.
     * 思路
     * 1. 返回类型 Person对象
     * 2. 方法的名字 copyPerson
     * 3. 方法的形参 (chapter07.Person p)
     * 4. 方法体 创建新对象 复制属性并返回
     */

    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }

}