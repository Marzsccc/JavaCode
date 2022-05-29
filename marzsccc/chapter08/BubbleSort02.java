package chapter08;

import java.util.Arrays;

public class BubbleSort02 {
    public BubbleSort02() {

    }

    public static void main(String[] args) {
        /*
         * 冒泡排序：
         * 从小到大排序：
         * 总共n个元素，进行n-1轮排序（外层循环），
         * 每一轮排序确定该轮中最大的数，并把它放到最后
         * 第一轮确定最大的数，第二轮确定第二大的数，最后一轮是两个数中确定倒数第二大的数
         * 两两比较，如果前面的数大于后面的数就交换
         * 每轮的比较次数逐次减少
         *
         *
         *
         */


        int arr[] = {24, 69, 80, 57, 13};
        int temp = 0;
        int lun = arr.length - 1;
        for (int i = 0; i < lun; i++) { // 后写外层循环 排序的轮数
            for (int j = 0; j < lun - i; j++) { // 先写内层循环 排序执行的次数
                if (arr[j] > arr[j + 1]) {// > 控制大的放最后 < 控制小的放最后
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}