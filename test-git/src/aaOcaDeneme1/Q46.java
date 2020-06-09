package aaOcaDeneme1;

public class Q46 {
    int a1;
    public static void doProduct(int a){
        a=a*a;
    }
    public static void doString(StringBuilder s){
        s.append(" "+s);
    }
    public static void main(String[] args) {
        Q46 item= new Q46();
        item.a1=11;
        StringBuilder sb = new StringBuilder("hello");
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+item.a1);
    }
}
