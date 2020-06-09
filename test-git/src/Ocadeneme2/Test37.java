package genel;

public class Test37 {

	public static void main(String[] args) {
		Employee employee= new Employee();
		Employee manager= new Manager();
		Manager director= new Director();
		
		employee.salary=10000;
		manager.salary=20000;
		director.salary= 30000;
		director.budget=100;
		
		//sadece employee'nin field'ini gorebiliyor
		//Referencelari farkli olsa o sinifin ozelliklerini gorebilirler
	}

}
