package JHomeworks;

public class Day14 {
    public static void main(String[] args) {

        int[] myArray = {34, 5, 6, 2, 3, 78, 1};
           int max=Integer.MIN_VALUE;
       for (int i = 0; i < myArray.length; i++) {
            int value =myArray[i];
           if(value> max){
                max=value;
           }
        }
        System.out.println(max);

        System.out.println("TASK2-------------------------------------");
        int min = Integer.MAX_VALUE;
        for (int currentNumber : myArray) {
            if (currentNumber < min) {
                min = currentNumber;
            }
        }
        System.out.println("Min: " + min);

        System.out.println("TASK3-------------------------------------");
        int sum = 0;
        for (int currentNumber : myArray) {
            sum += currentNumber;
        } // 0 + 34 + 5 + 6 + 2 + 3 + 78 + 1

        double average = (double) sum / myArray.length;
        System.out.println("Average:  " + average);







    }
}
