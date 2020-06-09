package JHomeworks.day43;

public class Hmwrk43 {

    // Let's write a Online-Shop that sells books: ChildrenBook & Comics
// use inheritance, polymorphism and encapsulation while doing this

// Note: this HW is open-ended, so there a lot of way to solve it
// task about salary is similar to this

// Hint: you can use Book as parent class and define price() method there


    public static void main(String[] args) {

        Books b=new Comics();

        ((Comics)b).setBookName("SpiderMan");

        ((Comics)b).price();

        ((Comics)b).setPageNumber(150);



        Books b1=new ChildrenBook();

        b1.setBookName("Alice in Wonderland");


        b1.setPageNumber(100);

        b1.price();
    }

}
