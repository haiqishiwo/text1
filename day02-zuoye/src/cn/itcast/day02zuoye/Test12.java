package cn.itcast.day02zuoye;
//十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
public class Test12 {
    public static void main(String[] args) {
        String[] a ={"SFAS","sdasd","dsada2","dsadasf13","21da"};
        Integer[] b ={12,52,51,45,24,523,5,2435,2};
        String[]c = A(a);
        Integer[] d = A(b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]+" ");
        }
    }
    public static <E> E[]  A(E[] a){
        int max = a.length-1;
        int min = 0;
        for (;min<=max; min++,max--) {
            E temp = a[max];
            a[max] = a[min];
            a[min] = temp;
        }
        return a;
    }
}
