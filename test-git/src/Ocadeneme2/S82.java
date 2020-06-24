package Ocadeneme2;

public class S82 {
	String name;
	Boolean contract;
	double salary;
	S82(){
		name="Joe";
		contract=true;
		salary= 100.0f;
//		this.name=new String("Joe");
//		this.contract= new Boolean(true);
//		this.salary= new Double (100);
	}
	
	public String toString(){
		return name+":"+ contract+ ":"+salary;
	}

	public static void main(String[] args) {
		S82 e= new S82();
//		e.name="Joe";
//		e.contract=true;
//		e.salary=100;
	
		System.out.print(e);
	}  

}
