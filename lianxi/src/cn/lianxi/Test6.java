package cn.lianxi;

import java.util.Scanner;

//题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
//        再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
public class Test6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入初始高度：");
        double x = a.nextDouble();
        System.out.println("请输入落地次数：");
        double y = a.nextDouble();
        if (y >= 2) {
            double[] sum = new double[(int) y];
            sum[0] = x;
            sum[1] = x;
            for (int i = 2; i < y; i++) {
                sum[i] = sum[i - 1] / 2;
                if (i == y - 1) {
                    System.out.println("第" + y + "次反弹高度为：" + (sum[i] / 2));
                }
            }
            double zong = 0;
            for (int i = 0; i < sum.length; i++) {
                zong += sum[i];
            }
            System.out.println("共经过：" + zong + "米");
        } else if (y == 1) {
            System.out.println("第" + y + "次反弹高度为：" + (x / 2));
            System.out.println("共经过：" + x + "米");
        }
    }
}