public class Day15HomeWork2 {
    //Task
    // 1. Return the number of even ints in the given array.
    // {1,2,3,4,5,6} => 3
    // Hint: you need to count "even numbers"
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];

            if (array[i] % 2 == 0) {
                counter++;
            }

        }
        System.out.println("you have"+ counter+ " even numbers");
    }
}
