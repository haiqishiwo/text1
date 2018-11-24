package cn.itcast.day02zuoye;

import java.util.ArrayList;
import java.util.Random;

//十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
public class Test10 {
    public static void main(String[] args) {
        int[]a =new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < a.length; i++) {
            int x = r.nextInt(100)+1;
            a[i]=x;
            System.out.print(a[i]+ " ");
            if(x>=10){
                list.add(x);
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
