package aaOcaDeneme1;
class Base{
    public void test(){
        System.out.println("Base ");
    }
}
class DerivedA extends Base {
    public void test(){
        System.out.println("DerivedA ");
    }
}

public class Q1 extends DerivedA {

    public void test() {
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Base b1 =new Q1();
        Base b2 = new DerivedA();
        Base b3 = new Q1();
        b1= (Base)b3;
        Base b4 =(DerivedA)b3;
       // b1= (Base)b2;
        b1.test();
//        b2.test();
//        b3.test();
        b4.test();
    }
}
//What is the result?
