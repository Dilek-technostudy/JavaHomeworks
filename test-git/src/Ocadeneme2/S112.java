public class S112 {

	private static final boolean TRUE = true;

	public static void main(String[] args) {
		boolean a= new Boolean(Boolean.valueOf("TRUE"));
		boolean b= new Boolean("Null");
		System.out.println(a+ " " +b);

	}
	  // javac Test.java
	  // java Test TRUE null //not case sensitive, other than true everything false
	
	  //Result: true false

}
