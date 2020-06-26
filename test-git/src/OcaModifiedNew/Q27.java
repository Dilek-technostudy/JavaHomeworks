package OcaModifiedNew;
class CheckingAccount1 {
    public int amount;
    public CheckingAccount1(){
        amount=100;
        //this.amount=100;
    }
}
    public class Q27 {
        public static void main(String[] args) {

        CheckingAccount1 acct = new CheckingAccount1();

            acct.amount=100;
            System.out.println(acct.amount);

    }
}