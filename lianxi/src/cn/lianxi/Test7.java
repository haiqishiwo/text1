package cn.lianxi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//求任意个数的集合的笛卡尔积
//        如：	{1,2,3} 和 {A,B,C}
//        1	A
//        1	B
//        1	C
//        2	A
//        2	B
//        2	C
//        3	A
//        3	B
//        3	C
public class Test7 {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(2);
        List b = new ArrayList();
        b.add('A');
        b.add('F');
        b.add('D');
        b.add('S');
        List c = new ArrayList();
        c.add("SDD");
        c.add("WWS");
        c.add("GGG");
        c.add("OOO");
        List d = new ArrayList();
        d.add("李小龙");
        d.add("李中龙");
        d.add("李大龙");
        d.add("李巨龙");
        List<List> test = new ArrayList<>();
        test.add(a);
        test.add(b);
        test.add(c);
        test.add(d);
        A(test);

    }

    private static int i1 = 1; //表示在递归中for循环几次

    public static void A(List<List> lists) {
        if (lists.size() == 1) {
            List list = lists.get(0);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            List list1 = lists.get(0);
            for (int i = 0; i < list1.size(); i++) {
                String a = "";
                a += list1.get(i);
                Map<Integer, List<String>> b = B(lists, i1, a);
                for (int i1 = 0; i1 < b.size(); i1++) {
                    List<String> strings = b.get(i);
                    for (int i2 = 0; i2 < strings.size(); i2++) {
                        String g = strings.get(i2);
                        System.out.println(g);
                    }
                }
            }
        }
    }

    public static Map<Integer, List<String>> B(List<List> lists, int i1, String str) {
        if (lists.size() == (i1 + 1)) {
            List list = lists.get(i1);
            Map<Integer, List<String>> map1 = new HashMap<>();
            List<String> c = new ArrayList<>();
            for (int i3 = 0; i3 < list.size(); i3++) {
                String g = str;
                str += " ";
                str += list.get(i3);
                c.add(str); //将最后一个循环中的所有字符串放入List集合中
                str = g;//将str回归成之前的样子
            }
            map1.put(0, c); //将字符串放入map集合中，为了和返回值对应
            return map1;
        } else {
            List list = lists.get(i1);
            i1++;
            Map<Integer, List<String>> map2 = new HashMap<>();
            for (int i2 = 0; i2 < list.size(); i2++) {
                String r = str;
                str += " "; //输出中间加空格
                str += list.get(i2);
                Map<Integer, List<String>> b = B(lists, i1, str);
                str = r; //将str回归成之前的样子
                List<String> c = new ArrayList<>();
                for (int i4 = 0; i4 < b.size(); i4++) {
                    List<String> strings = b.get(i4);
                    for (int i5 = 0; i5 < strings.size(); i5++) {
                        String g = strings.get(i5);
                        c.add(g);
                    }
                }
                map2.put(i2, c);   //0:(0-1,0-2...),1:(1-1,1-2...)...
            }
            return map2;
        }
    }


}
