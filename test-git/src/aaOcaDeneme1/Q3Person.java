package aaOcaDeneme1;

public class Q3Person {
    String name;
    int age = 25;

    public Q3Person() {

    }

    public Q3Person(String name){
        this();
        setName(name);
    }

    public Q3Person(String name, int age){
      this (name);     //Q3Person (name) burada hata veriyor.This deyince kaldiriyor.
        setAge(age);
    }
//    setter and getter methods
     public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return name +age + "";
    }

    public static void main(String[] args) {
        Q3Person p1 = new Q3Person("Jesse");
        Q3Person p2 = new Q3Person("walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
