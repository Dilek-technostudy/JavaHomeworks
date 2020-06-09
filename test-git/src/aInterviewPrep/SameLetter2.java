package aInterviewPrep;

import org.junit.Assert;
import org.junit.Test;

public class SameLetter2 {
    @Test
    public void GIVEN_abc_cba_WHEN_same_THEN_true(){
        SameLetter test = new SameLetter();

        Boolean actual = test.same("abc", "cba");
        Assert.assertTrue(actual);
    }

    @Test
    public void GIVEN_abc_cab_WHEN_same_THEN_true(){
        SameLetter test = new SameLetter();

        Boolean actual = test.same("abc", "cab");
//        Boolean expected = true;
        Assert.assertTrue(actual);
    }

    @Test
    public void GIVEN_abc_acb_WHEN_same_THEN_true(){
        SameLetter test = new SameLetter();

        Boolean actual = test.same("abc", "acb");
        Assert.assertTrue(actual);
    }

    @Test
    public void GIVEN_abc_zxc_WHEN_same_THEN_false(){
        SameLetter test = new SameLetter();

        Boolean actual = test.same("abc", "zxc");
        Assert.assertFalse(actual);
    }

    @Test
    public void GIVEN_abc_bbb_WHEN_same_THEN_false(){
        SameLetter test = new SameLetter();
        Boolean actual = test.same("abc", "bbb");

        Assert.assertFalse(actual);
    }

    @Test
    public void GIVEN_null_null_WHEN_same_THEN_true(){
        SameLetter test = new SameLetter();
        Boolean actual = test.same(null, null);

        Assert.assertTrue(actual);
    }

    @Test
    // "" "" = false
    public void GIVEN_empty_empty_WHEN_same_THEN_true(){
        SameLetter test = new SameLetter();
        Boolean actual = test.same("", "");

        Assert.assertTrue(actual);
    }

}
