package Wednesdaypackage;

class Vehicle4 {
   int x;
   Vehicle4(){
        this(10); // line n1
    }
    Vehicle4 (int x) {
        this.x =x;
   }
}
class Car4 extends Vehicle4 {
    int y;
   Car4(){
       super();
   //    this(20); //line n2
   }
    Car4( int y) {
       this.y =y;
    }
   public String toString(){
        return super.x +":" +this.y;
    }
}
 public class Q31 {
    public static void main(String[] args) {
         Vehicle4 y = new Car4();
         System.out.println(y);
    }
}
