package Ocadeneme2;

public class S72 {
 static int count; //soruda static olmadigi icin count olan satirlar hata veriyor
public static void displayMsg(){
	count++;
	System.out.println(count);
}
public static void main (String []args){
	displayMsg();
	displayMsg();
}
}
