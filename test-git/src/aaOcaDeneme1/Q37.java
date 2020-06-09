package aaOcaDeneme1;

class Employee{
    public int salary;
}
 class Manager extends Employee{
    public int budget;
}
class Director extends Manager{
    public int stockOptions;
}

public class Q37{
    public static void main(String[] args) {
// Employee employee= new Employee();
// Manager manager=new Manager();
// Director director=new Director();
    Employee employee= new Employee();
    Employee manager= new Director();
    Employee director=new Manager();

    }
}

//yukarki class asagiyi gormuyor.ama asagidaki yukarkilerin metodlarini kapsiyor.
