
public class S60 {
    
    
	public static void main(String[] args) {
		S60 ts= new S60();
		System.out.print(isAvailable+ " ");
		isAvailable=ts.doStuff();
		System.out.println(isAvailable);}
	
	public static boolean doStuff(){
		return !isAvailable;
		
	}	
	
    static boolean isAvailable=false;

}
