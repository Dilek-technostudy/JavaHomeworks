package aaJavaOcaPrep.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayList {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("hawk");
//        list.add(Boolean.TRUE);
//        System.out.println(list);
//
//
//        ArrayList<String> safer=new ArrayList<>();//sadece string kabul et dedigimiz iicin hata veriyor
//        safer.add("saprrow");
////        safer.add(Boolean.TRUE);

        List<String> birds=new ArrayList<>();
        birds.add("hawk");

        birds.add(1,"robin");
        System.out.println(birds.size());
        System.out.println(birds);


        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        System.out.println(birds);
        System.out.println(birds.remove("parrot"));
        System.out.println(birds.remove("blue jay"));
        System.out.println(birds.remove(0));
        System.out.println(birds);
        System.out.println(birds.size());
        birds.set(0, "raven");
        System.out.println(birds.size());
        System.out.println(birds);
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("raven"));
        System.out.println(birds.isEmpty());
        birds.clear();
        System.out.println(birds.size());

    }
}