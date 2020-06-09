
public class S27 {
 int id;
 String name;
 public S27(int id,String name) {
	 this.id= id;
	 this.name= name;
 }
	public static void main(String[] args) {
	  S27 p1= new S27(101, "Pen");
	  S27 p2= new S27(101, "Pen");
	  S27 p3= p1;
	  boolean ans1=p1==p2;
	  boolean ans2=p1.name.equals(p2.name);
	  System.out.println(ans1+ ":"+ ans2);
	  

	}

}
