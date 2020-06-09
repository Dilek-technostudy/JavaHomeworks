
public class S18 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		sb.append("hello");  // append metodu her tur data aliyor
		//sb.deleteAll(); boyle bir metod yok
		//sb.delete(0, sb.size()); size metodu yok
		sb.delete(0, sb.length());
		//sb.removeAll();   boyle bir metod yok
		
		System.out.println(sb);
	

	}

}
