package cn.lianxi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test13 {
    public static void main(String[] args) {
        Test14 test1 = new Test14();
        test1.setName("zhangsan");
        Test14 test11 = new Test14();
        test11.setName("zhangsan1");
        System.out.println(test1);

        System.out.println(test11);
//        System.out.println(test1==test11);
        System.out.println(test1.hashCode());
        System.out.println(test11.hashCode());
//
//        Map map =new HashMap();
//        map.put(test1,"1");
//        map.put(test11,"2");
//        System.out.println(map.size());
    }
}
