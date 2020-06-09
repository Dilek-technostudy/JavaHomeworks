package aaOcaDeneme1;

import javax.imageio.stream.ImageInputStream;

public class Q21 {
    char c;       //defoult degeri bosluk.Wrapper class Character olursa null oluyor.
    boolean b;      //Boolean b olsaydi null olurdu.
    float f;        //Float f null oluyor
    byte e;
    int i;
    long l;
    double d;
    String s;
    void printAll(){
        System.out.println("c= "+c);
        System.out.println("b= "+b);
        System.out.println("f= "+f);
        System.out.println("e= "+e);
        System.out.println("i= "+i);
        System.out.println("l= "+l);
        System.out.println("d= "+d);
        System.out.println("s= "+s);

    }

    public static void main(String[] args) {
        Q21 f= new Q21();
        f.printAll();
    }
}
