package chapter07;

public class VariableParameters01 {

    public static void main(String[] args){
        cal02 sum1 = new cal02();
        System.out.println("sum="+sum1.sum(1,2,3,4,5));
    }
}


class cal02{
    // calculate sum of numbers，but we dont know how many formal parameters
    //1.int... means receives variadic parameters，type is int，(0-many)
    //2. when use variadic parameters, regard them as arrays
    public int sum(int... nums){
        System.out.println("接收的参数个数="+nums.length);
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            res += nums[i];
        }
        return res;
    }
}