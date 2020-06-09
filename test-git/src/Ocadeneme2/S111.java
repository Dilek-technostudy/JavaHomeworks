package Sorular101;

public class S111 {

	public static void main(String[] args) {
		int x=100;
		int a= x++;
		int b=++x;
		int c=x++;
		int i=0;
		int d=(a<b)? (a<c)?a:(b<c)? b:c :x ;  // sorunun aslinda x: yok
											// compilation fails	
System.out.println(d);
	}

}
