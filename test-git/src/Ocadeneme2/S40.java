import java.util.ArrayList;

public class S40 {
  public static void main(String[] args) {
	ArrayList myList= new ArrayList();
	String[] myArray;
	try{
		while(true){
			myList.add("My String");
		}
	}
	catch (RuntimeException re) {
		System.out.println("Runtime");
	}
	catch (Exception e) {
		System.out.println("exception");
	}
	System.out.println("ready to use");
}
}
