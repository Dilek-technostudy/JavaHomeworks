package Sorular101;

class MyException extends RuntimeException {}

public class S120 {

public static void main(String[] args){
	try{
		method1();
	}
	catch (MyException ne) {
		System.out.println("A");
	}
}
public static void method1() {
	try {
		double x= Math.random();
		System.out.println(x);
		throw  x>0.5 ?new MyException(): new RuntimeException();
	} catch (RuntimeException re) {
		System.out.println("B");
	}
}
}
// RuntimeException base(parent) class oldugu icin MyException da firlatsa tutuyor sonuc B
//catchlerin yerini degistirirsek A ya da B olabiliyor
//