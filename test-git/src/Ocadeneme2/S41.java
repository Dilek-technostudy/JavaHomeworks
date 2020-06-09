
public class S41 {

	public static void main(String[] args) {
		//boolean opt=true;
		String opt= "true";
		switch (opt) {
		case "true":
			System.out.print("True ");
			break;
		default:
			System.out.print("***");
		}
		System.out.println("done");
	}
// valid parameters String, int, short, byte, char
// invalid parameters boolean, long, double, float	
}
