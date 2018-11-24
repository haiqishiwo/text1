package cn.itcast.day02zuoye;

import java.util.ArrayList;

//五、定义一个方法listTest(ArrayList<String> al, String s),
// 要求使用contains()方法判断al集合里面是否包含s。
public class Test5 {
    public static void listTest(ArrayList<String> a1, String s){
    if(a1.contains(s)){
        System.out.println(a1+"中包含"+s);
    }else {
        System.out.println(a1+"中不包含"+s);
         }
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("21312");
        a.add("212s");
        a.add("2fa12");
        a.add("2ge12");
        a.add("fww12");
        a.add("fdsafsaf");
        listTest(a,"212s");
    }
}
