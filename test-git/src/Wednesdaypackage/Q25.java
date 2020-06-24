package Wednesdaypackage;
interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {   //line n1
    public void readBook();
}

abstract class Book implements Readable {   //line n2
    public void readBook(){
        System.out.println("Read Book");
    }

}
 class EBook extends Book {
     public void download() { //burada hata veriyor. soruda bu kisim yok bunu implement yapmasigerekiyor.
     }

     public void readBook() {
         System.out.println("Read E-Book");
     }
 }
public class Q25{
    public static void main(String[] args) {
        Book book1 = new EBook();
            book1.readBook();
    }
}

