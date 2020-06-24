package OcaModifiedNew;

public class Q119 {
    String greet = "Welcome";
    public Q119(){
        String greet="Hello";
    }
    public void setGreet(){
        String greet="Good Day";
    }

    public static void main(String[] args) {
        Q119 t = new Q119();
        String greet ="good Luck";
        System.out.println(t.greet);
    }
}
