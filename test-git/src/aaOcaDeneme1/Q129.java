package aaOcaDeneme1;

public class Q129 {
//  public static void test(int x, int y){
//	  x=x++;
//	  y=y++;
//  }
	public static void main(String[] args) {
		int x=1;
		int y=0;
		if(x++>++y){
		    System.out.print("Hello ");}
		else{
			System.out.print("Welcome ");
		}
		//test(x, y);
		System.out.println("Log "+ x + ":" +y);

	}

}
