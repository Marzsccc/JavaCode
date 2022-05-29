package chapter07;

public class Homework02 {
    public static void main(String[] args) {
        String[] strs = {"jack","tom","mary","milan"};
        A02 a02 = new A02();
        int index= a02.find("213",strs);
        System.out.println("查找的index="+index);

    }
}


class A02{


    public int find(String findstr,String[] strs){
        //遍历
        for(int i=0;i<strs.length;i++){
            if(findstr.equals(strs[i])){
                return i;
            }
        }
        return -1;
    }
}