package OcaModifiedNew;

public class Q131 {
}
class Vehicle1 {
    int x;

    Vehicle1() {

        this(10);// line n1
    }

    Vehicle1(int x) {
        this.x = x;
    }
}
class Car extends Vehicle1{
    int y;

    Car() {
        super(10);
        //this(20)              // line n2
    }

    Car(int y) {
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle1 y = new Car();
        System.out.println(y);
    }
}