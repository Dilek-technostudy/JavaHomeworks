package Sorular51;


public class S91 {
public static int stVar=100;
public int var=200;
public String toString(){
	return var+":"+stVar;
}
	public static void main(String[] args) {
		
		S91 t1= new S91();
		t1.var=300;
		System.out.println(t1);
		S91 t2=new S91();
		t2.stVar=300;
		System.out.println(t2);
	
	}

}
