package cn.itcast.day02zuoye;

import java.util.ArrayList;

//六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
public class Test6 {
    public static void main(String[] args) {
    ArrayList<String> a =new ArrayList<>();
    a.add("2");
    listTest(a);
    }
    public static void listTest(ArrayList<String> al){
       if(al.isEmpty()){
           System.out.println(al+"集合中元素为空");
       }else {
           System.out.println(al+"集合中元素不为空");
       }
    }
}
