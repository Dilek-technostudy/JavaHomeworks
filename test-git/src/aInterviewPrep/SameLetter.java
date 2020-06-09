package aInterviewPrep;

import java.util.Arrays;

public class SameLetter {
    /*
    1. Write a return method that check if a string is build out of the same
    letters as another string.
    Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
    */

    //maps

    //nested loops

//    public static void main(String[] args) {
//        same("abc","cab");
//        same("abc","abb");
//    }

    public Boolean same(String a, String b){
        if(a == null && b == null){
            return true;
        }else if(a == null || b == null){
            return false;
        }
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        return Arrays.equals(charsA, charsB);
    }
}
