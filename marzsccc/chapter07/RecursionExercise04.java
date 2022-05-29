package chapter07;

public class RecursionExercise04 {
    public static void main(String[] args){
        findNumber01 aa = new findNumber01();
        System.out.println(aa.numbers01(5));



    }
}

class findNumber01{
    public  int numbers01(int i){
        if(i==10){
            return 0;
        }else{
            return -1;
        }
    }
}