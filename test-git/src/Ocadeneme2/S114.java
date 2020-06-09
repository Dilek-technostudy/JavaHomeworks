package Sorular101;

class S114 {

	public static void main(String[] args) {
		Short s1=200;
		Integer s2= 400;
		Long s3= (long) s1+s2;
		//String s4= (String)(s3*s2);  compilation fails
		//System.out.println("Sum is "+ s3);
		StringBuilder sBuilder= new StringBuilder();
		sBuilder.append(4.5);
		sBuilder.deleteCharAt(0);
		System.out.println(sBuilder);
	 
		// int, short olursa otomatik longa donusuyor
		//Integer, Short castingle Long'a donusuyor
	}

}
