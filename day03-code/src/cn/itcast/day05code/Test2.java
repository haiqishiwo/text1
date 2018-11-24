package cn.itcast.day05code;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Student> a = new HashSet<>();
        Student a1 = new Student("梅西",16);
        Student a5 = new Student("梅西",16);
        Student a2 = new Student("梅西1",16);
        Student a3 = new Student("梅西",18);
        Student a4 = new Student("梅西2",19);
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        System.out.println(a);
    }
}
