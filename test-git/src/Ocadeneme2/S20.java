
public class S20 {

	public static void main(String[] args) {
		String str1= "Java";
		String[] str2 ={"J", "a", "v", "a"};
		String str3= "";
		for (String str:str2){
			str3= str3+str;
		}
		String str4=new String("Java");
		//String str4="Java";
		
       boolean b1= (str1==str3);
       boolean b2= (str1.equals(str3));
       boolean b3= (str1==str4);
       System.out.print(b1+", "+b2+ ", "+b3);
	}

}
