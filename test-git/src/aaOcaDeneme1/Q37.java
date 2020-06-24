package aaOcaDeneme1;

class Employee1{
    public int salary;
}
 class Manager extends Employee1{
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
    Employee1 employee= new Employee1();
    Employee1 manager= new Director();
    Employee1 director=new Manager();

    }
}

//yukarki class asagiyi gormuyor.ama asagidaki yukarkilerin metodlarini kapsiyor.
