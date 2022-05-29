package chapter08.use1;
import java.util.Arrays;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-24 12:58:59
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class Import01 {
    public static void main(String[] args){

        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);// Call the function directly
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }

    }
}


