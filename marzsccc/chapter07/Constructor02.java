package chapter07;

public class Constructor02 {
    public static void main(String[] args){
        T22 T1=new T22();
    }

}



class T22{
    /*
    *  Detail: use constructor
    *  Note that this keyword can only access another constructor within a constructor
    *  Note that this(parameters); must be placed in the first statement.
    * */
    public T22(){
        this("jack",100);
        System.out.println("chapter07.T() constructor");
    }

    public T22(String name,int age){
        System.out.println("chapter07.T(String name,int age) constructor");
    }

    public void f1(){
        System.out.println("f1() method");
    }

    public void f2(){
        System.out.println("f2() method");
        /*
        * the way of call fuctions are different.
        * */
        //1. call the fuction directly
        f1();
        //2. use this key words to call fuction
        this.f1();
    }
}


