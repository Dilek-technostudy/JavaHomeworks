package aaOcaDeneme1;

public class Q27 {
 int id;
 String name;
 public Q27(int id, String name) {
	 this.id= id;
	 this.name= name;
 }
	public static void main(String[] args) {
	  Q27 p1= new Q27(101, "Pen");
	  Q27 p2= new Q27(101, "Pen");
	  Q27 p3= p1;
	  boolean ans1=p1==p2;
	  boolean ans2=p1.name.equals(p2.name);
	  System.out.println(ans1+ ":"+ ans2);
	  

	}

}
