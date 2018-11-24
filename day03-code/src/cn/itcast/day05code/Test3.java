package cn.itcast.day05code;

public class Test3 {
    public static void main(String[] args) {
        A(0,0);
        A(01,02);
        A(01,02,5,6,7,8,9);
        B("张三","李四","王五");
    }
    public static void A(int a, int b , int ... c ){
        int sum = 0 ;
        sum+=a;
        sum+=b;
        System.out.println(c.length);
        for(int d : c){
            sum+= d ;
        }
        System.out.println(sum);
    }
    public static void B(String... a ){
        System.out.println(a.length);
        for(String b:a){
            System.out.print(b+" ");
        }
    }
}
