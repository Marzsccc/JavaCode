package chapter07;

public class Homework04 {
    public static void main(String[] args){
        A04 a04 = new A04(1,0);
        System.out.println(a04.num1+"  "+a04.num2);
        double a=a04.div();
        System.out.println(a);
    }
}



class A04{
    double num1,num2;
    public  A04(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double div(){
        if(num2 ==0){
            System.out.println("分母不能为零");
            return null;
        }else{
            return num1 /num2;
        }
    }

}