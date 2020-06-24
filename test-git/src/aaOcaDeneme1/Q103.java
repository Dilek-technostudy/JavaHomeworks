package aaOcaDeneme1;

class As{
	public As(){
		System.out.print("A ");
	}
}
class Bs extends As {
	public Bs() {
		System.out.print("B ");
	}
}

class S103 extends Bs {
	public S103() {
		System.out.print("C ");
	}
	public static void main(String[] args) {
		As c= new S103(); //A B C
//		Bs bs= new Bs(); // A B
//		As as=new As(); //A
	}

}



