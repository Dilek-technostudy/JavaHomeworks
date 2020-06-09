package aaJavaOcaPrep.Chapter3;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {


        int[] numbers = {6, 9, 1};//169
      //  System.out.println(numbers.toString());
          Arrays.sort(numbers);
         System.out.println(Arrays.binarySearch(numbers ,6));


        for (int i = 0; i < numbers.length; i++)
            System.out.print (numbers[i] +  " ");



//        System.out.println("           ");
//        String[] strings = { "10", "9", "100" };
//        Arrays.sort(strings);
//
//        for (String string : strings)
//            System.out.print(string + " ");

    }
}
