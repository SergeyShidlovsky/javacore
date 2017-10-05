package com.kitcenter.app.homework.lesson6;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 05.10.2017.
 */
public class EvenOddTest {

    //Method that is checking if number is even
    public static String checkEven(double a) {
        if(a % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    @Test
    public void checkEvenTest1() {
        double a = 0;
        String expRes = "Even";
        String actRes = EvenOdd.checkEven(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkEvenTest2() {
        double a = 4;
        String expRes = "Even";
        String actRes = EvenOdd.checkEven(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkEvenTest3() {
        double a = -6;
        String expRes = "Even";
        String actRes = EvenOdd.checkEven(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkEvenTest4() {
        double a = -3;
        String expRes = "Odd";
        String actRes = EvenOdd.checkEven(a);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkEvenTest5() {
        double a = 5;
        String expRes = "Odd";
        String actRes = EvenOdd.checkEven(a);
        Assert.assertEquals(expRes, actRes);
    }

}
