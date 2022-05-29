package chapter05.shuzu;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-28 18:14:56
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class shuzuinitialize {

    /*
        问题: 二维数组中存储的是一维数组, 那能不能存入 [提前创建好的一维数组] 呢 ?
        答 : 可以的
     */
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = {44,55,66};
        int[] arr3 = {77,88,99,100};

        int[][] arr = new int[3][3];
//        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

//        arr[2][3] = 100;
//        System.out.println(arr[2]);
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;//这里是对arr[2]使用了重新赋值的操作，因此本来是[3][3]的二维数组在最后一行由3个元素变成了4个元素


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//        System.out.println(arr[1][2]);
//        System.out.println(arr[2][3]);
    }

}
