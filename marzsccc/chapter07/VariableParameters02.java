package chapter07;

public class VariableParameters02 {

    public static void main(String[] args){
        cal02 sum1 = new cal02();
        System.out.println("sum="+sum1.sum(1,2,3,4,5));
    }
}


class cal03{

    public void f1(int... nums){
        System.out.println("长度="+nums.length);
    }
    // details of VariableParameters
    //1. Variable parameters can be placed in a formal parameter list along with parameters of normal type
    // but must guaranteed variableparameters put on the last.
    public void f2(String str,double... nums){

    }

    // 2. one formal parameter list can only have one variable parameters
    // The following example is the wrong syntax
//    public void f3(int... nums1,double... nums2){
//
//    }
}

