package chapter07;

public class RecursionExercise03 {
    /*猴子吃桃问题
    假设n个桃子，每一天吃前一天的(1/2+1) 个桃子
    当第10天时，还没吃只剩下1一个桃子了。求最初有几个桃子？
    */


    /*
    1.分析 ：逆推法
    1.day=10，1个桃子
    2.day=9，桃子 （day10+1）*2

    y(n) = {y(n+1) + 1} * 2 

    */
    public static void main(String[] args){
        T03 t1 = new T03();
        int day = 3;
        if (day >=1 && day <=10){
            System.out.println("第"+day+"天有"+t1.peachNum(day)+"个桃子");
        }
    }
}


class T03 {
    public int peachNum(int day){
        if(day==10){
            return 1;
        }else if(day >=1 && day <= 9){
            return (peachNum(day+1)+1)* 2;
        }else{
            System.out.println("你输入了错误的数字");
            return -1;
        }
    }
}