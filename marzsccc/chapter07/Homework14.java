package chapter07;

public class Homework14 {
}

/*
* Reuse the constructor
* */
class Employee{
    String name;
    char gender;
    int age;
    String job;
    double sal;

    public Employee(String job,double sal){
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job,double sal, String name,char gender,int age){
        this(name,gender,age); // only can recall the constructor in the first sentence
        this.job =job;
        this.sal = sal;

    }

}