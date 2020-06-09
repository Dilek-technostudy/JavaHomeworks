package aaJavaOcaPrep.Chapter3;
import java.lang.*;

public class StringBuild_ {
    public static void main(String[] args) {
//        String alpha="";
//        for(char current='a';current<='z';current++)
//            alpha += current;
//         System.out.println(alpha);
//





        StringBuilder alpha=new StringBuilder();
        for(char current1='a';current1<='z';current1++)
            alpha.append(current1);
        System.out.println(alpha);

    }



}

