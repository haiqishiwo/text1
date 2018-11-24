package cn.lianxi;

import java.util.Scanner;

//题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String  a= sc.nextLine();
        char[]cha =a.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < cha.length; i++) {
            if(cha[i]==32){
                count1++;
            }else if(65<=cha[i]&&cha[i]<=90||97<=cha[i]&&cha[i]<=122){
                count2++;
            }else if(48<=cha[i]&&cha[i]<=57){
                count3++;
            }else {
                count4++;
            }
        }
        System.out.println("空格为："+count1+"个，英文字母为："+count2+"个，数字为："+count3+"个，其他字符为："+count4+"个");
    }
}
