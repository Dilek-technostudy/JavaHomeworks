
//    public void test(){
//        System.out.println("base");
//    }
//
//}
//class DerivedA extends Base{
//    public void test() {
//        System.out.println("derived A");
//    }
//}
//class DerivedB extends DerivedA{
//    public void test() {
//        System.out.println("derived B");
//    }

//    public static void main(String[] args) {
//        Base b1 = new DerivedB();
//        Base b2= new DerivedA() ;
//        Base b3 = new DerivedB();
//        b1 =(Base )b3;
//        Base b4=(DerivedA) b3;
//        b1.test();
//        b4.test();


//    public static void main(String[] args) {
//        String s1 = "Java";
//        String s2 = "Java";
//
//        StringBuild_ sb1 = new StringBuild_();
//        sb1.append("Ja").append("va");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(sb1.toString() == s1);
//        System.out.println(sb1.toString().equals(s1));
//    }
public class FeedingSchedule {

    public static void main(String[] args) {
//        boolean keepGoing = true;
//       int count = 0;
//       int x = 3;
//       while(count++ < 3) {
//         int y = (1 + 2 * count) % 3;
//       switch(y) {
//         default:
//         case 0: x -= 1; break;
//          case 1: x += 5;       }
//       }
//       System.out.println(x);
//        }

        int x = 5, j = 0;
        OUTER:
        for (int i = 0; i < 3; )
            INNER:do {
                i++;
                x++;
                if (x > 10)
                    break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);


    }

}
