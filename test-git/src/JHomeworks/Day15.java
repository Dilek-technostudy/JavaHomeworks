package JHomeworks;

public class Day15 {
    // you have string array of numbers,
    // change data type to int, using loop
    // the array size should be minimum 15
    //ex: {"11", "13", "17"} =>  {11, 13, 17}

    public static void main(String[] args) {
       String [] strArray = new String [15];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i]= ""+ i;
        }
        String sum = "";
        for(String s: strArray){
            sum +=s;
        }
        System.out.println("String sum ="+sum);

        int [] numbers= new int [15];
        for (int i = 0; i < numbers.length; i++) {
             numbers[i]= Integer.valueOf(strArray[i]);
        }
        int sum1 =0;
        for(int n:numbers){
            sum1 +=n;
        }

        System.out.println("sum of the integer numbers = " +sum1 );
    }

}
