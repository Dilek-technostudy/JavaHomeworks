
public class S21 {
 
 char c;  //Character c ise null oluyor
 boolean b; // Boolean b null
 float f; //Float f null, wrapper classlarin hepsi null
 byte e;	
 int i;
 long l;
 double d;
 String s;
 
 void printAll (){
	 System.out.println("c= "+c);
	 System.out.println("b= "+b);
	 System.out.println("f= "+f);
	 System.out.println("i= "+i);
	 System.out.println("e= "+e);
	 System.out.println("l= "+l);
	 System.out.println("s= "+s);
	 System.out.println("d= "+d);
 }	
 public static void main(String[] args) {
		S21 f= new S21();
		f.printAll();

	}

}
