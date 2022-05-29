package chapter07;

public class Homework01 {
    public static void main(String[] args){
    A01 A = new A01();
    double arr[] = {1.0, 4.7,2.8};
    Double res = A.max(arr);
    if(res != null){
        System.out.println("the chapter02.max value of arr is :"+res);
    }
       else{ System.out.println("Incorrect input, please try again:");}
    }
}

/**
 * 编写类A01 定义方法max，实现求某个double数组的最大值，并返回
 * */

class A01{
    public Double max(double[] arr){
        if(arr != null && arr.length>0){
            double max = arr[0]; //assert the first element is chapter02.max value
            for(int i=0;i< arr.length;i++){
                if(max<arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }else{
            return null;
        }

    }

}
