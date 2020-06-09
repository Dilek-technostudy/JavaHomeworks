class Employee{
	public int salary;
}
class Manager extends Employee{
	public int budget;
}

class Director extends Manager{
	public int stockOptions;
}
public class S37 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Manager manager= new Manager();
		Director director= new Director();
		
		
		Employee employee1=new Employee();
		Employee manager1= new Manager();
		Employee director1= new Director();

	}

}
