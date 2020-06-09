package aaJavaOcaPrep.Chapter3.reviewQuestions;

public class Q2 {
    public static void main(String[] args) {
        String s ="Hello";
        String t=new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t==s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello"==s) System.out.println("four");
        if ("Hello"==t) System.out.println("five");
    }
}
class Q5{
    public static void main(String[] args) {
        String s1="java";
        StringBuilder s2=new StringBuilder("java");
        StringBuilder s3=new StringBuilder("java");
        // if(s1==s2) System.out.print("1");
        if(s3.equals(s2)) System.out.println("2lkjkl");
        System.out.println(s2);
    }
}