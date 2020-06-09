package aaJavaOcaPrep.Chapter3;

public class StringClassMethods {
    public static void main(String[] args) {
        String string="animals";
//        System.out.println(string.charAt(7)); //String index out of range 7 //after the code does not compile
        System.out.println(string.length());//7 when determining the total size or length, Java uses normal counting again.


        System.out.println(string.charAt(0));
        System.out.println(string.charAt(6));


        System.out.println(string.indexOf('a'));

        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3));
        System.out.println(string.substring(0,7));
          System.out.println(string.substring(3,6));


//        System.out.println(string.toUpperCase());
//        System.out.println(string.toLowerCase());
//
//        System.out.println("abc".equals("ABC"));
//        System.out.println("abc".equalsIgnoreCase("ABC"));
//
//        System.out.println("abc".startsWith("A"));
//
//        System.out.println("abc".contains("A"));
//
//        System.out.println("abc".replace('a','A'));
//
//        System.out.println("     abc".trim());
//
//        System.out.println("AniMal        ".trim().toLowerCase().replace('a','A'));
//
//        String a="abc";
//        String b=a.toUpperCase();
//        b=b.replace("B","2").replace('C','3');
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//

    }
    }

