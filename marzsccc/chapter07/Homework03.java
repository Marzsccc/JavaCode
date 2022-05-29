package chapter07;

public class Homework03 {
    public static void main(String[] args) {
        A03 a03 = new A03();
//        String[] oldstr = {"123","456","789"};
//        String[] newArr=a03.copyArr(oldstr);
        int[] oldstr = {123,456,789};
        int[] newArr = a03.copyArr(oldstr);
        for(int i =0;i< newArr.length;i++) {

            System.out.println(newArr[i]);
        }
        System.out.println(a03.pai());
    }
}


class A03{
    public int[] copyArr(int[] oldArr){
        int[] newArr = new int[oldArr.length];
        for(int i=0;i< oldArr.length;i++){
            newArr[i] = oldArr[i];
        }
        return  newArr;
    }


    public double pai(){
        return Math.PI;
    }
}