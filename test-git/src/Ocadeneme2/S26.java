
public class S26 {
	static int count=0;
	int i=0;
	public void changeCount() {
		while(i<5){
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		S26 check1= new S26();
		S26 check2= new S26();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count+ ":" + check2.count);
		System.out.println(check1.i+ ":" + check2.i);
	}

}
