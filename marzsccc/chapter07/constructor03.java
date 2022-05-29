package chapter07;

public class constructor03 {

    public static void main(String[] args){
        PersonComparison p1 = new PersonComparison("marry",100);
        PersonComparison p2 = new PersonComparison("marry",10);
        System.out.println(p1.comparTo(p2));

    }
}



class PersonComparison{

    String name;
    int age;
    public PersonComparison(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean comparTo(PersonComparison p){
//        if(this.name.equals(p.name) && this.age == p.age){
//            return true;
//        } else{
//            return false;
//        }

        return this.name.equals(p.name) && this.age == p.age;
    }

}