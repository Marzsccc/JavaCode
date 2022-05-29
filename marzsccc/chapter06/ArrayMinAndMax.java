package chapter06;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-28 15:13:51
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class ArrayMinAndMax {
    public  static void main(String[] args){
        ArrMinandMin arrMinandMin = new ArrMinandMin();
        int[] arr = {99,2,3,4,5,6,7,8};
        int[] minAndMax = arrMinandMin.getArrMinAndMax(arr);
        System.out.println("min value is "+minAndMax[0]+"\nmax value is "+minAndMax[1]);
    }
}


class ArrMinandMin{
    public int[] getArrMinAndMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max <arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int[] minAndMax = {min,max};
        return minAndMax;
    }
}