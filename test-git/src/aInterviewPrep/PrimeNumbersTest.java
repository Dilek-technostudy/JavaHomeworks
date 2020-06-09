package aInterviewPrep;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumbersTest {
    private PrimeNumbers test;

    @Before
    public void before(){
        test = new PrimeNumbers();
    }


    @Test
    public void GIVEN_0_WHEN_isPrime_THEN_false(){
        Assert.assertFalse(test.isPrime(0));
    }

    @Test
    public void GIVEN_1_WHEN_isPrime_THEN_false(){
        Assert.assertFalse(test.isPrime(1));
    }

    @Test
    public void GIVEN_2_WHEN_isPrime_THEN_true(){
        Assert.assertTrue(test.isPrime(2));
    }

    @Test
    public void GIVEN_17_WHEN_isPrime_THEN_true(){
        Assert.assertTrue(test.isPrime(17));
    }

    @Test
    public void check_other_method_also(){
        Assert.assertTrue(test.isPrime(17));
    }

}

