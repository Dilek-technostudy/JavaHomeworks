public class S71 {

	public static void main(String[] args) {
		//Byte x=1;
		//short x=1;
		//String x="1"; //wrong  switch case doesn't accept String value it has to be case "1"
		//Long x= 1L;   //wrong
		//Double x= 1;  //wrong
		Integer x= new Integer("1");
		switch (x) {
		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;
		}

	}

}
