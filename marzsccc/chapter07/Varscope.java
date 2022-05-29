package chapter07;

public class Varscope {
    public static void main(String[] args) {

    }
}

class varscope{

    int age = 10;
    int num =100;
    public void f(){
        int a =10;
        System.out.println(age);
        System.out.println(a);
    }
    public void f2(){
        System.out.println(num);
    }
}