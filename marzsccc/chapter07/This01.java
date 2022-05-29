package chapter07;

public class This01 {
    Person3 p1 = new Person3("Smith",22);

}


class Person3{
    String name;
    int age;
    // This keywords
    // we want use attribute name as formal parameters of constructor
    // but the scope of variable determines that we  tranfer a local variable to constructor
    // so we can use this keywords specify variable to attribute of class
    public Person3(String name,int age){
        this.name = name;
        this.age = age;
    }
}