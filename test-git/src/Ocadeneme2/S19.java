
public class S19 {
  private char var;
 
	public static void main(String[] args) {
	char var1= 'a';
	char var2 = var1;
	var2= 'e';
    
	S19 obj1= new S19();
	S19 obj2= obj1;
	
	obj1.var= 'i';
//	System.out.println(obj1.var);
//	System.out.println(obj2.var);
	obj2.var= 'o';
	
	
	System.out.println(var1+", "+var2);
	System.out.print(obj1.var + ", "+obj2.var);
	}

}
