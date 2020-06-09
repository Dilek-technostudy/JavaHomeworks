package aInterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    //find sum of first 100 prime number
    //divisible by 1 and itself
    //0, 1 is not prime
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        //this could be wrong
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> primeNumbers() {
        List<Integer> primeNumbers = new ArrayList<>();

        int counter = 0;
        for (int i = 0; counter < 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
                counter++;
            }
        }
        return primeNumbers;
    }

    public long sum(List<Integer> list){
        long sum = 0;
        for (Integer integer : list) {
            sum+=integer;
        }
        return sum;
    }
}
