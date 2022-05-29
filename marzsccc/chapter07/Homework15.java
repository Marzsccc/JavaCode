package chapter07;

public class Homework15 {
    public static void main(String[] args){
        PassObject po = new PassObject();
        CircleArea c = new CircleArea();



        po.printAreas(c,5);

    }

}


class CircleArea{
    double radius;

//    public chapter07.CircleArea(double radius){
//        this.radius = radius;
//    }

    public double findArea(){
        return Math.PI * radius *radius ;
    }

    public double findArea2(double radius){
        return Math.PI * radius *radius ;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

}

class PassObject{
    public void printAreas(CircleArea c,int times){
        System.out.println("radius\tarea");
        for(int i=1;i<=times;i++){// output the value of cirle ardius
//            c.setRadius(i);
//            System.out.println(i + "\t" + c.findArea());
            System.out.println((double)i + "\t\t" + c.findArea2(i));
        }
    }
}