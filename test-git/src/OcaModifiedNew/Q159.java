package OcaModifiedNew;
class Book{int pages;}
public class Q159 {
    int count;
    public void method(Book x,int k){
        x.pages=100;
        k=200;
    }
    public static void main(String[] args) {
        Q159 obj =new Q159();
        Book objBook =new Book();
        System.out.println(objBook.pages+": "+obj.count);
        obj.method(objBook,obj.count);
        System.out.println(objBook.pages+": "+obj.count);
    }
}
