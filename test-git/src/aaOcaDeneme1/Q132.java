package aaOcaDeneme1;
class MyString{
	String msg;
	MyString(String msg) {
		this.msg=msg;
	}
//	public String toString(){
//		return msg;
//	}
}

public class Q132 {

	public static void main(String[] args) {
		
		System.out.println("Hello "+ new StringBuilder("Java SE 8") );
		System.out.println("Hello " + new MyString("Java SE 8"));

	}
  
}