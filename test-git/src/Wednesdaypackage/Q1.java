package Wednesdaypackage;

public class Q1 {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
        bool[0] = new Boolean(null);
        bool[1] = new Boolean(Boolean.parseBoolean("true"));
         //null in degeri olmadigi icin false donusur

        System.out.println(bool[0] + " " + bool[1]);
    }
}