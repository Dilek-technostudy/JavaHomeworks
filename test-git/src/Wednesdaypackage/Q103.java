package Wednesdaypackage;
class Student {
    String name;
    public Student(String name){
        this.name=name;
    }
}
public class Q103 {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {
            System.out.println(" " + s.name);
        }


//        Student [] students= new Student[3];
//       students[0]=new Student("Richard");
//        students[1]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//       }

    }
}