package OcaModifiedNew;
class N1 {
    public N1(){
        System.out.println("N1");
    }
}
class N2 extends N1{
    public N2(){
        System.out.println("N2");
    }
}
public class Q47 extends N2{
    public static void main(String[] args) {
         N1 obj1 = (N1) new N2();
       N2 obj2 = (N2) new Q47();
     // N2 obj3 = (N2) new N1();
        Q47 obj4 = (Q47) obj2;
    }
}
