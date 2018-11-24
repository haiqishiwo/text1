package cn.lianxi;

import java.util.Scanner;

//题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
//
//        判断完数的方法
public class Test5 {
    public static void main(String[] args) {
        int k = 2 ;
        for (int i = 2; i < 1001; i++) {
        int sum = 0 ;
        for(;;){
            if(i==k){
                sum+=k;
                break;
            }else if(i>k&&i%k==0){
                sum+=k;
                i=(i/k);
            }else if (i%k!=0){
                k+=1;
            }
            }
            if(i == sum){
                System.out.print(i+" ");
            }
        }
    }
}
