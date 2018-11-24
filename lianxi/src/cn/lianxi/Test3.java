package cn.lianxi;

import java.util.Scanner;

//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
//        程序分析：利用辗除法。
//        *这里有一个知识点要记住的，最大公约数和最小公倍数的求法
//        *1、先求最大公约数bigDivisor
//        *2、就可以很方便获得最小公倍数multiple=input1*input2/bigDIvisor
//        *这里最重要的就是求最大公约数：求法如下
//        *(1)用大的数对小的数求余
//        *(2)把小的数赋值给大的数，把求余获得的结果赋值给小的数，
//        *(3)循环上一步的操作，直到求余的结果为零
//        *(4)上一步被求余的数就是我们要的最大公约数，不信的话，你可以动手试试
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数：");
        int y = sc.nextInt();
        int max = x > y ? x : y;
        int min = x < y ? x : y;
        int yu = 0 ;
        yu = min%max;
        min = yu;
        for(;;){
           if(max%min!=0){
               yu = max%min;
               max = min ;
               min = yu;
           }else {
               break;
           }
        }
        int bei =x*y/yu;
        System.out.println("最大公约数是："+yu);
        System.out.println("最小公倍数是："+bei);
    }
}
