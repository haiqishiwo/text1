package cn.itcast.day02zuoye;

import java.util.ArrayList;

//三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
public class Test3 {
    public static void main(String[] args) {
        System.out.println(000000);
        int[] a ={1,52,321,512,521};
        System.out.println(A(a));
    }
    public static ArrayList<Integer> A(int[]a){
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
           b.add(a[i]);
        }
        return b;
    }
}
