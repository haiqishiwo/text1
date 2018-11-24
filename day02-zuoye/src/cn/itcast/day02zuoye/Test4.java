package cn.itcast.day02zuoye;

import java.util.ArrayList;

//四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
// 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22);
        a.add(21);
        a.add(12);
        a.add(62);
        a.add(42);
        Object[] o = new Object[a.size()];
        for (int i = 0; i < o.length; i++) {
            o[i]=a.get(i);
        }
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
    }
}
