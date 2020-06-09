class Caller{
	private void init() {
		System.out.println("initialized");
	}
	public void start() {
		init();
		System.out.println("started");
	}
}

public class S78 {

	public static void main(String[] args) {
		Caller c= new Caller();
		c.start();
//		c.init();
		
// We can not call private methods outside of the class
	}

}
