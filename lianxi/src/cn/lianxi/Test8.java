package cn.lianxi;

import java.util.ArrayList;
import java.util.List;

/**
 * 用1，2，2，3，4，5这6个数字，用java写一个main函数，打印出所有不同的排列，
 * 如：512234，412345等，要求：“4”不能在第三位，“3”与“5”不能想连。
 */
public class Test8 {
    public static void main(String[] args) {
        List<String> a = new ArrayList();
        a.add("1");
        a.add("2");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        List<String> c = new ArrayList<>();
        b:
        for (int i = 0; i < a.size(); i++) {
            ArrayList<String> clone4 = (ArrayList<String>) ((ArrayList<String>) a).clone();
            String integer = a.get(i);
            a.remove(integer);
//            System.out.print(integer);
//            System.out.println(a);
            c:
            for (int i1 = 0; i1 < a.size(); i1++) {
                ArrayList<String> clone3 = (ArrayList<String>) ((ArrayList<String>) a).clone();
                String integer1 = a.get(i1);
                a.remove(integer1);
                if (Integer.parseInt(integer) == 3 && Integer.parseInt(integer1)  == 5 || Integer.parseInt(integer)  == 5 && Integer.parseInt(integer1)  == 3) {
                a=clone3;
                continue ;
                }
//                System.out.print(integer1);
//                System.out.println(a);
                for (int i2 = 0; i2 < a.size(); i2++) {
                    ArrayList<String> clone2 = (ArrayList<String>) ((ArrayList<String>) a).clone();
                    String integer2 = a.get(i2);
                    a.remove(integer2);
                    if(Integer.parseInt(integer2) == 3 && Integer.parseInt(integer1)  == 5 || Integer.parseInt(integer2)  == 5 && Integer.parseInt(integer1)  == 3){
                        a=clone2;
                        continue ;
                    }
                    if(Integer.parseInt(integer2)==4){
                        a=clone2;
                        continue ;
                    }
//                    System.out.print(integer2);
                    for (int i3 = 0; i3 < a.size(); i3++) {
                        ArrayList<String> clone1 = (ArrayList<String>) ((ArrayList<String>) a).clone();
                        String integer3 = a.get(i3);
                        a.remove(integer3);
                        if(Integer.parseInt(integer2) == 3 && Integer.parseInt(integer3)  == 5 || Integer.parseInt(integer2)  == 5 && Integer.parseInt(integer3)  == 3){
                            a = clone1;
                            continue ;
                        }
//                        System.out.print(integer3);
                        for (int i4 = 0; i4 < a.size(); i4++) {
                            ArrayList<String> clone5 = (ArrayList<String>) ((ArrayList<String>) a).clone();
                            String integer4 = a.get(i4);
                            a.remove(integer4);
                            if(Integer.parseInt(integer4) == 3 && Integer.parseInt(integer3)  == 5 || Integer.parseInt(integer4)  == 5 && Integer.parseInt(integer3)  == 3){
                                a = clone1;
                                continue ;
                            }
//                            System.out.print(integer4);
                            for (int i5 = 0; i5 < a.size(); i5++) {
                                String integer5 = a.get(i5);
                                ArrayList<String> clone = (ArrayList<String>) ((ArrayList<String>) a).clone();
                                a.remove(integer5);
                                if(Integer.parseInt(integer4) == 3 && Integer.parseInt(integer5)  == 5 || Integer.parseInt(integer4)  == 5 && Integer.parseInt(integer5)  == 3){
                                    a=clone5;
                                    continue ;
                                }
//                                System.out.println(integer);
                                c.add(integer+integer1+integer2+integer3+integer4+integer5);
//                                System.out.println(a);
//                                System.out.print(integer5);
//                                System.out.println();
                                a= clone;
                            }
                            a=clone5;
                        }
                        a = clone1;
                    }
                    a=clone2;
                }
                a=clone3;
            }
            a=clone4;
        }
        List d = new ArrayList();
        System.out.println(c.size());

        for (int i1 = 0; i1 < c.size(); i1++) {
            for (int i = 0; i < c.size(); i++) {
                String s = c.get(i);
                String s1 = c.get(i1);
                boolean  g =true;
                for (int i2 = 0; i2 < d.size(); i2++) {
                   if(d.get(i2).equals(s)){
                       g=false;
                   }
                }
                if(i1!=i  && s.equals(s1) && g){
//                    System.out.println(i+","+i1);
                    d.add(c.get(i));
                }
            }
        }
        for (int i = 0; i < d.size(); i++) {
//            System.out.println(d.get(i));
          c.remove(d.get(i));
        }
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
        System.out.println(c.size());

    }

}
