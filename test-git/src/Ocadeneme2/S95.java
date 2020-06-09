class Vehicle1{
	String type= "4W";
	int maxSpeed=100;
	
	 Vehicle1(){}
	
	Vehicle1(String type, int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	
	}
}
class Car1 extends Vehicle1{
	String trans;
	Car1(String trans)
	{  //yukarda bos constructor olmazsa burada hata veriyor
		//super("4W", 200);
		this.trans=trans;
	}
	Car1 (String type, int maxSpeed, String trans){
		super(type, maxSpeed);
		this.trans=trans;
		//this(trans);  iki tane parantezli birarada olmuyor
	}
}

public class S95 {

	public static void main(String[] args) {
		Car1 c1=new Car1("Auto");
		Car1 c2=new Car1("4W",150, "Manual");
		System.out.println(c1.type +c1.maxSpeed+ c1.trans );
		System.out.println(c2.type +c2.maxSpeed+ c2.trans );
		

	}

}
