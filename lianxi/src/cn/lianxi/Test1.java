package cn.lianxi;

import java.util.Scanner;

//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少
//1.1.2.3.5.8.13.21.34
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int a = sc.nextInt();
        int sum = 0;
        sum = A(a);
        System.out.println(a + "个月之后兔子对数为：" + sum);

    }

    public static int A(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            int b = A(a - 1) + A(a - 2);
            return b;
        }
    }
}
