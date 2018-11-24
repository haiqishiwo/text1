package cn.itcast.day05code;

import java.util.HashSet;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("das");
        a.addFirst("dsada");
        a.addLast("d12d21");
        System.out.println(a);
        System.out.println(a.pop());  //removeFirst
        System.out.println(a);
        a.push("张三");             //addFirst
        System.out.println(a);
        HashSet b =new HashSet();
        b.hashCode();
    }
}
