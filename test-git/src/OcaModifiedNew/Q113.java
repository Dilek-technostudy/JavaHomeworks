package OcaModifiedNew;

public class Q113 {
     public   int stock =10;
    public  void purchase (int qty){stock -=qty;}

    public  void  sell(int qty) {stock -=qty;}
    public  void printStock(String action){

     //   System.out.println(action +": "+ qty+"items.stock in hand :"+stock);

    }

    public static void main(String[] args) {
        Q113 k1 = new Q113();
        k1.sell(5);
        k1.printStock("sold");

        Q113 k2 = new Q113();
        k2.purchase(5);
        k2.printStock("Purchased");

    }
}
