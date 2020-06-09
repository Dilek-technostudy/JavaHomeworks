package aaJavaOcaPrep.Chapter3.reviewQuestions;

import java.util.Arrays;

public class Array1 {
    public static void main(String args[]) {
//        String[] bugs = {"cricket", "beetle", "ladybug"};
//        String[] alias = bugs;
//        System.out.println(bugs.equals(alias));     // true
//        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
//        System.out.println(Arrays.toString(bugs));


        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;
        System.out.println(Arrays.toString(numbers));



    }
}