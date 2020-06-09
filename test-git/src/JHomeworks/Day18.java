package JHomeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day18 {
    public static void main(String[] args) {

        //10. Write a Java program to shuffle elements in a array list.[advanced]
        //12. Write a Java program to extract a portion of a array list.
        //14. Write a Java program of swap two elements in an array list.
        //17. Write a Java program to empty an array list.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("Orange");
        colors.add("white");
        colors.add("black");
        System.out.println("list before shuffling: " + colors );
        Collections.shuffle(colors);
        System.out.println("list after shuffling:"  +  colors);


        List<String> sub_list= colors.subList(0,2);
        System.out.println(sub_list);
        System.out.println("************************************8");

        Collections.swap(colors, 2,4);

        System.out.println("after swap " + colors);

        colors.removeAll(colors);

        System.out.println("array list after " + colors);


        System.out.println("array list after " +"\n" +colors.isEmpty());
    }
}
