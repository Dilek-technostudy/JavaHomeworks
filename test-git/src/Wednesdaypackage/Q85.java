package Wednesdaypackage;

import java.io.IOException;

class MyException extends RuntimeException {}
public class Q85 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        }
    }

    public static void method1() { // line n1
        try {
            throw 3 > 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        } catch (Exception re) {
            System.out.print("B");
        }

    }
}
//second way:

//    public static void method1(){ // line n1
//        try {
//            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
//
//        } catch (RuntimeException re) {
//            System.out.print("B");
//        }
//
//    }
//
//
//}
