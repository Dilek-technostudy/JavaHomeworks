package Sorular101;

import java.util.ArrayList;
import java.util.List;

class Patient {
	String name;
	public Patient(String name){
		this.name=name;
	}
}
public class S117 {

	public static void main(String[] args) {
		List ps= new ArrayList();
		Patient p2=new Patient("Mike");
		ps.add(p2);
		
		int f=ps.indexOf(p2);  //correct answer
		//int f=ps.indexOf(Patient("Mike")); //not compile
		//int f=ps.indexOf(new Patient("Mike")); //result -1 defined new object, not an element of ps
		//Patient p= new Patient("Mike");
		//int f= ps.indexOf(p); //not added to List ps, result -1
		
		System.out.println(f);
		if(f>=0){
			System.out.println("Mike found");
		}
	}

}
