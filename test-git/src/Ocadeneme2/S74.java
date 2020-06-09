package Sorular51;

import org.omg.CORBA.PUBLIC_MEMBER;

class C2{
	public void displayC2() {
		System.out.println("C2");
	}
}
interface I {
	public void displayI();
}
class C1 extends C2 implements I{
	public void displayI() {
		System.out.println("C1");	
	}
	public void displayC2(){
		System.out.println("C1C2");
	}
}
public class S74 {

	public static void main(String[] args) {
		C2 obj1= new C1();
		I obj2= new C1();
		C1 obj3= new C1();
		
		C2 s= (C2) obj2;
		I t= (I) obj1;
		I z= obj3;
		C2 y=obj3;
		
		t.displayI();
		s.displayC2();
		z.displayI();
		y.displayC2();
		
		
		
	}

}
