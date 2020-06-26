package OcaModifiedNew;

public class Q147 {
}
class Employee1 {
    private String name;
    private int age;
    private int salary;

    public Employee1 (String name,int age) {
        setName (name);
        setAge (age);
        setSalary (2000);
    }

    public Employee1 (String name,int age,int salary) {
        this(name,age);
        setSalary (salary);
    }


    // getter and setter methods for attributes go here
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printDetails () {
        System.out.println(name +" : "+age+" : "+salary);
    }
}
class Test {
    public static void main(String[] args) {
//	Employee1 e1 = new Employee1 (); // defoult contructor olmadigi icin
        //Employee classda hata veriyor.

        Employee1 e2 = new Employee1("Jack", 50);
        Employee1 e3 = new Employee1("Chloe", 40, 5000);

//	     e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}