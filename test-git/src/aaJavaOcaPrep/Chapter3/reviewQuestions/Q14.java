package aaJavaOcaPrep.Chapter3.reviewQuestions;

public class Q14 {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        System.out.println(puzzle);

    }
}
