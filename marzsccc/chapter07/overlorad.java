package chapter07;

public class overlorad {
    public static void main(String[] args){
    calculate01 cal1 = new calculate01();
    System.out.println(cal1.calculate(1,1));
    System.out.println(cal1.calculate(1,1.1));
    System.out.println(cal1.calculate(1.1,1.1));
    System.out.println(cal1.calculate(1,2,3));

    }
}


class calculate01{
    public int calculate(int n1,int n2){
        return n1+n2;
    }

    public double calculate(int n1,double n2){
        return n1+n2;
    }

    public double calculate(double n1,int n2){
        return n1+n2;
    }

    public double calculate(double n1,double n2){
        return n1+n2;
    }

    public int calculate(int n1,int n2,int n3){
        return n1+n2+n3;
    }

}