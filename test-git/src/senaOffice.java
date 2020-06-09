
  import java.util.Arrays;
import java.util.List;
public class senaOffice {


//        public static void main(String[] args) {
//            System.out.println(getTotal("0"));
//            System.out.println(getTotal("85"));
//            System.out.println(getTotal("936"));
//        }
//        /*
//         * TASK 1 Write a method named getTotal that accepts number as string
//         * argument and return sum of digits in provided number, but there is a
//         * catch if digit is even you digit is multiplied by 2 if digit is odd you
//         * digit is multiplied by -1 Note: if sum is zero then return -1
//         *
//         * ex1: you passed argument "85" and return is 11 because: (8 * 2) + (5 *
//         * -1) = 11
//         *
//         * ex2: "0" -> -1 becau
//         */
//        public static int getTotal(String num) {
//            int i = Integer.parseInt(num); //"85" => string int i = 85; //936
//            //System.out.println(i + " i ");
//            int j = Integer.valueOf(num);
//            //System.out.println(j + " j ");
//            int sum = 0;
//            int k = 0;
//
//            if (i <= 0) {
//                return -1;
//            }
//            while (i > 0) {  //85                             //936
//                k = i % 10; // 85 %10 = 5 k = 5  8 %10 k=8       //936 %10 k=6;   93%10 k =3;  9%10 k =9;
//                i = i / 10; // 85 /10 = 8 i = 8  8 / 10 i = 0    //936 / 10 i=93; 93 / 10 i =9;    i = 0;
//                if (k % 2 == 0) {
//                    sum += 2 * k; // sum += 2*8; sum = -5+16;          sum = 6*2=12;
//                } else {
//                    sum += -1 * k; // sum += -1*5 sum = -5:            sum += -1*3  = 9;    -1*9 sum =0;
//                }
//            }
//
//            return sum;
//        }
//
//


        public static void main(String[] args) {


       //to find the first duplicate occurence in an array
            Integer arr[] = {1,2,3,6,10,6,7,6};

            // arr array elmenlari arasinda dolanmak icin
            for(int i = 0; i < arr.length; i++) { // arr[0]=1 arr[1] = 2 arr[2]=3  arr[3]=6

                //kiyaslama icin geriye kalanlar arasinda dolanmak icin
                for(int j = i+1; j < arr.length; j++ ) { //j=1 arr[j]=2   j=2 arr[j]=3 j=3 arr[j]=6
                    if(arr[i]==arr[j]) {                 //j=2 arr[2]=3
                        System.out.println(arr[i]);      //j=3
                        return;                          //j=4
                    }

                }
            }
        }

//write a java program to count number of digits in an integer?
    //1287-4
    //243-3
 }
