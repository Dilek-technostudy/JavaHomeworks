package Sorular51;

import java.io.IOException;

class K{
	public void printFileContent() throws IOException{
		
		throw new IOException();
	}
}
public class S94 {
	public static void main(String[] args) throws Exception {
		K xobj= new K();
		//try {
		xobj.printFileContent();
			
		//}
		//catch(Exception e){}  
		//catch(IOException e){} 
		
	/* iki sekilde cozulebiliyor
	 * 1. printFileContent ve main methoda throws Exception veya IOException ekliyoruz
	 *    ikisi ayni olabilir, ilk metod IOException, main metod Exception olabilir
	 * 2. try/catch block exceptionlarin sirasina dikkat  
	 */
  
		
	}
}
