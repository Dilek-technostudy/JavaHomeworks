package aaJavaOcaPrep.Chapter3.reviewQuestions;

public class Q10 {
    public static void main(String[] args) {
        String a="";
        a+=2;
        a+='c';
        a+=false;
        if(a=="2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");
    }
}
