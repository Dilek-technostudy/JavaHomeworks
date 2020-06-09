
public class S49 {
String myStr= "7007";
    
public void doStuff(String str){
    	int myNum=0;
  
	try{
		 String myStr=str;
		myNum=Integer.parseInt(myStr);
	}catch (NumberFormatException ne) {
		System.err.println("Error");
	}
	System.out.println("myStr: "+ myStr+ ", myNum: "+ myNum);
}
	public static void main(String[] args) {
		S49 obj= new S49();
		obj.doStuff("9009");
		
		
	}


}
