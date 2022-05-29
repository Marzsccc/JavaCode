package chapter06;
/*
 * @Description : learning coding
 * 
 * @Version : 1.0
 * 
 * @Author : marzsccc
 * 
 * @Date : 2022-04-13 20:08:08
 * 
 * @LastEditors  : Do not edit
 * 
 * @LastEditTime : 2022-04-13 20:16:01
 * 
 * @FilePath     : \\chapter06\\chapter06.YangHui.java
 * Copyright (C) 2022 marzsccc. All rights reserved.
 */
import java.util.Arrays;

public class YangHui {
    public static void main(String[] args) {
        // 打印 10行 杨辉三角

        int yanghui[][] = new int[10][];

        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == yanghui[i].length - 1) {
                    yanghui[i][j] = 1;
                } else { //中间的元素
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                }
            }
        }
        // 输出
        for(int i = 0;i < yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+ "\t");
            }
            System.out.println();//换行
        }
    }
}