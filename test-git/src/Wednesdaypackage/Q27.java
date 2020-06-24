package Wednesdaypackage;

public class Q27 {
    public static int stVar = 100;
    public int var =200;

    public String toString () {
        return stVar + ":" + var;

    }

    public static void main(String[] args) {
        //And given the code fragment
        Q27 t1 = new Q27();
        t1.var =300;
        System.out.println(t1);

        Q27 t2 = new Q27 ();
        t2.stVar =300;
        System.out.println(t2);

        //what is the result?
    }
}
