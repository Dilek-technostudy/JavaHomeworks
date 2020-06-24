package OcaModifiedNew;
class Vehicle{
    Vehicle(){
        System.out.println("vehicle");
    }
}
class Bus extends Vehicle{
    Bus(){
        System.out.println("Bus");
    }
}
public class Q21 {
    public static void main(String[] args) {
        Vehicle v =new Bus();
    }


}
