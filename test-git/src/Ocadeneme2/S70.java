package Ocadeneme2;

class Vehicle1{
	int x;
	Vehicle1(){
		this(10);
	}
	Vehicle1(int x){
		this.x=x;
	}
}
class Car extends Vehicle1 {
	int y;
	Car(){
		//super();
		this(20);
	}
	Car(int y){
		this.y=y;
	}
	public String toString(){
		return super.x+":"+ this.y;
	}
}
public class S70 {

	public static void main(String[] args) {
		Vehicle1 y= new Car();
		System.out.println(y);

	}

}
