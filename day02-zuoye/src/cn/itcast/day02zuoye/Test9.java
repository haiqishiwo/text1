package cn.itcast.day02zuoye;

import java.util.ArrayList;

//九、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
//        A：遍历集合遍历输出。
//        B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇
public class Test9 {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        Student a1 = new Student("张三",20,"男");
        Student a2 = new Student("李四",28,"女");
        Student a3 = new Student("王五",17,"男");
        a.add(a1);
        a.add(a2);
        a.add(a3);
        for(Student b:a){
            System.out.println(b);
        }
        int max = 0 ;
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getAge()>=max){
                max = a.get(i).getAge();
                count = i ;
            }
        }
        a.get(count).setName("小猪佩奇");
        System.out.println(a.get(count).getName()+a.get(count).getAge()+a.get(count).getSex());


    }
}
