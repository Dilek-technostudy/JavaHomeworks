import java.util.ArrayList;

public class Day18Tasks {
    public static void main(String[] args) {
        //19. Write a Java program to trim the capacity of an array list the current list size.
        //20. Write a Java program to increase the size of an array list.
        //21. Write a Java program to replace the second element of a ArrayList with the specified element.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);
        colors.trimToSize();

        System.out.println("array list after trim:" + colors);


        colors.ensureCapacity(8);
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");

        System.out.println("new array list: " + colors);


        System.out.println("Original array list: " + colors);
        String new_color = "White";
        colors.set(1,new_color);

        int num=colors.size();
        System.out.println("Replace second element with 'White'.");
        for(int i=0;i<num;i++)
            System.out.println(colors.get(i));



    }
}
