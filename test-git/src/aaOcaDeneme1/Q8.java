package aaOcaDeneme1;
 class CheckingAccount{
    public int amount;
    public CheckingAccount (int amount){
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }
}
public class Q8 {
    public static void main(String[] args) {
     CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
//        this.amount = 0;
//        amount = 0;
//        acct (0) ;
          acct.amount = 0;
//        acct. getAmount () = 0;
 //      acct.changeAmount(0);
        acct.changeAmount(-acct.amount);
       acct.changeAmount(-acct.getAmount());
       System.out.println(acct.getAmount());
    }
}
