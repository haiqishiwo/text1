package cn.itcast.day02zuoye;

import java.util.ArrayList;

//八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
//        要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class Test8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(3);
        Integer s = 3 ;
        System.out.println(s+" 第一次出现的索引为："+listTest(list,s));
    }

    public static int listTest(ArrayList<Integer> al, Integer s){
        int index = -1 ;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)==s){
                index = i ;
                break;
            }
        }
        return index;
    }
}
