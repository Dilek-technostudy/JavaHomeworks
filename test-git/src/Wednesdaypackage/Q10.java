package Wednesdaypackage;
 class CheckingAccount {
    public int amount;                            //instanse variable // to call instance we can call trough the object

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x) {
        amount += x;
        //And given this main method, located in another class:
    }
}
public class Q10 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000)); //Math.rondom() rondom bir rakam olustururyor.
        // line n1
   //   acct.setAmount(-acct.getAmount());
      acct.amount = 0;     //dogru
      acct.setAmount(0); //dogru
//       acct.getAmount()=0;
//      this.amount = 0;
      // acct.changeAmount(0);
      acct.changeAmount(-acct.amount);//dogru
//        setAmount();
        System.out.println(acct.getAmount());
    }
}
