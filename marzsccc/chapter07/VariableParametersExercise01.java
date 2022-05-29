package chapter07;

public class VariableParametersExercise01 {
    public static void main(String[] args){
        HAS myscores = new HAS();
        System.out.println(myscores.showScore("gxl",99,99,100));
    }
}


class HAS{

    public String showScore(String name,double...scores){
        double totalScore =0;
        for(int i=0;i < scores.length; i++){
            totalScore += scores[i];
        }
        return  name +" have "+scores.length +" courses"+" ,his/her total scores is="+ totalScore;
    }


}