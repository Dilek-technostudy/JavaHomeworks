package Wednesdaypackage;

public class Q23 {
    public static void main(String[] args) {
        // given the code fragment
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        // insert Answer code here
        do {
            idx++;
        } while (idx < size - 1);
        System.out.println("The Top Element: " + stack[idx]);
    }
}