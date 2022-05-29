package chapter07;

public class HanoiTower {

    public static void main(String[] args){
    Tower tower = new Tower();
    tower.move(6,'A','B','C');
    }
}


class Tower{
    // new method
    // num denotes numbers of moves;a,b,c means a tower,b tower,c tower,respectively
    public void move(int num,char a,char b,char c){
        //if we only have one dish
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //if we have more than one dish,we can treat them as two dish,
            //one is the bottom,other is over it.
            //Strategy
            /*
            * (1)First, moving all dishes over the bottom one of a tower to the b tower by using c tower
            * (2)Next,moving the bottom one to the c tower
            * (3)Then, moving all dishes of b tower to c tower by using a tower
            * */
            //(1)
            move(num-1,a,c,b);
            //(2)
            System.out.println(a+"->"+c);
            //(3)
            move(num-1,b,a,c);
        }
    }
}