package chapter01;

/*
 * @Description  : learning coding
 * @Version      : 1.0
 * @Author       : marzsccc
 * @Date         : 2022-03-06 20:04:55
 * @LastEditors  : marzsccc
 * @LastEditTime : 2022-03-06 21:34:48
 * @FilePath     : \\chapter01\\autoConvertDetail.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
public class autoConvertDetail {
    public static void main(String[] args) {
        // (bite,short,char)之间不会自动转换
        // 当把 具体数值 赋值给byte时，先判断该数值是否在byte的范围内，如果在范围内可以直接赋值
        // 当把 变量 赋值给byte时，先判断类型是否可以转换，再判断数值
        byte b1 = 10; // 对的 10在-128~127范围内
        int n1 = 1;
        // byte b2 = n1; // 错的，int不可以转成byte
        // char c1 = b1; // 错的，byte不可以转成字符

        // 细节：byte,short,char 三者可以计算，计算时首先转换为int类型
        byte b3 = 1;
        short s1 = 1;
        // short s2 = b3 + s1;// 错误，b2 + s1 => int
        int s2 = b3 + s1;
        // boolean 不参与转换
        boolean pass = true;
        // int num111 = pass;
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

    }
}
