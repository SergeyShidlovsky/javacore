package com.kitcenter.app.homework.lesson6;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 05.10.2017.
 */
public class CompareNumbersTest {

    @Test
    public void CompareNumbersTest1() {
        double a = 0, b = 5;
        String expRes = b + " is bigger";
        String actRes = CompareNumbers.checkBigger(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void CompareNumbersTest2() {
        double a = 77, b = 5;
        String expRes = a + " is bigger";
        String actRes = CompareNumbers.checkBigger(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void CompareNumbersTest3() {
        double a = 7, b = 7;
        String expRes = b + " is bigger";
        String actRes = CompareNumbers.checkBigger(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void CompareNumbersTest4() {
        double a = -2, b = -5;
        String expRes = a + " is bigger";
        String actRes = CompareNumbers.checkBigger(a, b);
        Assert.assertEquals(expRes, actRes);
    }
}
