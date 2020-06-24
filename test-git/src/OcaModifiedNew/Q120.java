package OcaModifiedNew;
class Cart{
    Productt p;
    double totalAmount;
}
class Productt{
    String name;
    Double price;
}
public class Q120 {
    public static void main(String[] args) {
        Cart c=new Cart();
        System.out.println(c.p+": "+c.totalAmount);

    }
}
