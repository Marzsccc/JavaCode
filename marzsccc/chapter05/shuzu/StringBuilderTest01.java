package chapter05.shuzu;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-28 21:20:30
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class StringBuilderTest01 {
/*
思路：
    1:定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
    2:定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。
      返回值类型 String，参数列表 int[] arr
    3:在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
    4:调用方法，用一个变量接收结果
    5:输出结果
*/

    public static void main(String[] args) {
        //定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //调用方法，用一个变量接收结果
        String s1 = arrayToString(arr);


        //输出结果
        System.out.println("s:" + s1);

    }

    //定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回
/*
    两个明确：
        返回值类型：String
        参数：int[] arr
 */
    public static String arrayToString(int[] arr) {
        //在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(int i=0; i<arr.length; i++) {
            if(i == arr.length-1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }

        sb.append("]");

        String s = sb.toString();

        return  s;
    }
}
