package com.kitcenter.app.homework.lesson6;

import com.kitcenter.app.homework.lesson5.Calculation;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Nastya on 05.10.2017.
 */
public class CircleAreaTest {

    private static final double DELTA = 1e-15;

    //Declaring static variables;
    static double radius1;
    static double radius2;

    @Test
    public void calculateTest1() {
        radius1 = 1;
        double expRes = 3.14;
        double actRes = CircleArea.calcuate(radius1);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void calculateTest2() {
        radius1 = 0;
        double expRes = 0;
        double actRes = CircleArea.calcuate(radius1);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void calculateTest3() {
        radius1 = -1;
        double expRes = 3.14;
        double actRes = CircleArea.calcuate(radius1);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void calculateTest4() {
        radius1 = 3.14;
        double expRes = 3.14 * 3.14 * 3.14;
        double actRes = CircleArea.calcuate(radius1);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void compareTest5() {
        double circleArea1 = 1;
        double circleArea2 = 2;
        double expRes = 2;
        double actRes = CircleArea.compare(circleArea1,circleArea2);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void compareTest6() {
        double circleArea1 = 12;
        double circleArea2 = 2;
        double expRes = 12;
        double actRes = CircleArea.compare(circleArea1,circleArea2);
        Assert.assertEquals(expRes, actRes, DELTA);
    }

    @Test
    public void compareTest7() {
        double circleArea1 = 11;
        double circleArea2 = 11;
        double expRes = 11;
        double actRes = CircleArea.compare(circleArea1,circleArea2);
        Assert.assertEquals(expRes, actRes, DELTA);
    }
}
