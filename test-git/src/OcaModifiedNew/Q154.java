package OcaModifiedNew;

import java.util.ArrayList;

public class Q154 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String []myArray ;
        try {
            while (true) {
                myList.add("My String");
            }
        }
        catch (RuntimeException re) {
            System.out.println("cought an Runtime Exception");
        }
        catch (Exception e){
            System.out.println("cought an Exception");
        }
        System.out.println("Ready to use ");
    }
}
