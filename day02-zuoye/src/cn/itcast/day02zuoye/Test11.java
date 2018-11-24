package cn.itcast.day02zuoye;
//十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
public class Test11 {
    public static void main(String[] args) {
    String[] a ={"SFAS","sdasd","dsada2","dsadasf13","21da"};
    Integer[] b ={12,52,51,45,24,523,5,2435,2};
    String[]c = A(a,2,4);
    Integer[] d = A(b,0,3);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]+" ");
        }
    }
    public static <E> E[]  A(E[] a,int x,int y){
        E temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        return a;
    }
}