package cn.lianxi;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为“完数”,例如：6=1+2+3.
 * 编程找出1000以内所有完数
 */
public class Test10 {

    private static final Test10 TEST_10 = null;


    public static void main(String[] args) {



        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int num = 0;
        for (int i = 2; i < 1000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    b.add(j);
                }
            }
            for (int i1 = 0; i1 < b.size(); i1++) {
                num += b.get(i1);
            }
            if (i == num) {
                a.add(i);
            }
            num = 0;
            b.clear();
        }
        System.out.println(a);
    }
}
