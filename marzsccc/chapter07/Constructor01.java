package chapter07;

public class Constructor01 {
    // when we create a new object,we can specify the properties through Constructor
    Person2 p1 = new Person2("Smith",22);

}


class Person2{
    String name;
    int age;
    // Constructor
    // 1.Constructor dont have return,and it cant write with void.
    // 2.Constructor's is same as class.
    // 3. the rule of formal parameters list is same with method.
    public Person2(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}