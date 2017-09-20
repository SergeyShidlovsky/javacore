package com.kitcenter.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 18.09.2017.
 */
public class CalculationTest {

    private static final double DELTA = 1e-15;

    @Test
    public void multiplyTest1(){
        int a = 2, b = 3, expRes = 6;
        int actRes = Calculation.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void multiplyTest2(){
        int a = -2, b = 3, expRes = -6;
        int actRes = Calculation.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void multiplyTest3(){
        int a = -2, b = -3, expRes = 6;
        int actRes = Calculation.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void multiplyTest4(){
        int a = 0, b = 3, expRes = 0;
        int actRes = Calculation.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void additionTest5(){
        int a = 5, b = 3; double expRes = 8;
        double actRes = Calculation.addition(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void additionTest6(){
        int a = -5, b = 3; double expRes = -2;
        double actRes = Calculation.addition(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void additionTest7(){
        int a = -5, b = -3; double expRes = -8;
        double actRes = Calculation.addition(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void additionTest8(){
        int a = 0, b = -3; double expRes = -3;
        double actRes = Calculation.addition(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void additionTest9(){
        int a = 0, b = 0; double expRes = 0;
        double actRes = Calculation.addition(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }
    @Test
    public void divideTest10(){
        int a = 0, b = 0; double expRes = 0;
        double actRes = Calculation.divide(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void divideTest11(){
        int a = 1, b = 0; double expRes = 0;
        double actRes = Calculation.divide(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void divideTest12(){
        int a = 4, b = 0; double expRes = 0;
        double actRes = Calculation.divide(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void divideTest13(){
        int a = 4, b = 2; double expRes = 2;
        double actRes = Calculation.divide(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void divideTest14(){
        double a = 10, b = 2.5; double expRes = 4;
        double actRes = Calculation.divide(a,b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void elevateTest15(){
        int a = 0;
        int b = 0;
        int expRes = (int) Math.pow(a,b);
        int actRes = (int) Calculation.elevate(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void elevateTest16(){
        int a = 0;
        int b = 2;
        int expRes = (int) Math.pow(a,b);
        int actRes = (int) Calculation.elevate(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void elevateTest17(){
        int a = 8;
        int b = 0;
        int expRes = (int) Math.pow(a,b);
        int actRes = (int) Calculation.elevate(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void elevateTest18() {
        int a = 5;
        int b = 3;
        int expRes = (int) Math.pow(a, b);
        int actRes = (int) Calculation.elevate(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void elevateTest19(){
        int a = -3;
        int b = 2;
        int expRes = (int) Math.pow(a,b);
        int actRes = (int) Calculation.elevate(a,b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void elevateTest20() {
        int a = -4;
        int b = 4;
        int expRes = (int) Math.pow(a, b);
        int actRes = (int) Calculation.elevate(a, b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }
    @Test
    public void elevateTest21() {
        int a = -4;
        int b = -4;
        int expRes = (int) Math.pow(a, b);
        int actRes = (int) Calculation.elevate(a, b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }
    @Test
    public void elevateTest22() {
        int a = 0;
        int b = 0;
        int expRes = (int) Math.pow(a, b);
        int actRes = (int) Calculation.elevate(a, b);
        Assert.assertEquals(expRes, actRes, DELTA);
    }
}
