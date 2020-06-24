

import java.io.IOException;

class X {
	public void printFileContent() throws IOException{
		
		throw new IOException();
	}
}
public class S68 {
	public static void main(String[] args) throws Exception {
		X xobj=new X();
		
			xobj.printFileContent();
		

	}

}
