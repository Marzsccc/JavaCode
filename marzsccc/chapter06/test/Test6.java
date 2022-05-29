package chapter06.test;

import java.util.ArrayList;

/**
 * @ Description  : learning coding
 * @ Version      : 1.0
 * @ Author       : marzsccc
 * @ Date         : 2022-05-28 21:51:56
 * @ Copyright (C) 2022$ marzsccc. All rights reserved.
 */
public class Test6 {


    public  static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("123");
        list.add("456");
        list.add("test");
        list.add("test");
        for (int i = 0; i < list.size() ; i++) {
            String str = list.get(i);
//            if(str.equals("test")){
//                list.remove(str);
//            }
            if("test".equals(str)){ //避免出现空指针异常，因为str有可能是null，因此出现变量和常量进行比较，尽可能使用常量和变量进行比较！
                list.remove(str);
                i--; //因为删除一个元素之后，集合中的元素会自动补充空白元素，此时再i++，会漏掉删除元素后的第一个元素
            }
        }
        System.out.println(list);
    }

}
