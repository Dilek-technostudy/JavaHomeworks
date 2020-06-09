package aaOcaDeneme1;
interface Readable{
    public void readBook();
    public void setBookmark();
        }
 abstract class Book implements Readable{
    public void readbook(){}
        }

 class Ebook extends Book {
     public void readBook() { }
     public void setBookmark() { }

 }


      public class Q47{
          public static void main(String[] args) {
          Book book1=new Ebook();
          book1.readbook();
          }
      }


//86.soru benzer bak