package com.kitcenter.app.homework.lesson6;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 05.10.2017.
 */
public class TrianglesTest {

    @Test
    public void checkTriangleTest1() {
        double a = 3, b = 4, c = 5;
        String expRes = "can exist";
        String actRes = Triangles.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleTest2() {
        double a = 3, b = 0, c = 5;
        String expRes = "can't exist";
        String actRes = Triangles.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void checkTriangleTest3() {
        double a = 0, b = 7, c = 5;
        String expRes = "can't exist";
        String actRes = Triangles.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }


    @Test
    public void checkTriangleTest4() {
        double a = 3, b = 9, c = 0;
        String expRes = "can't exist";
        String actRes = Triangles.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }


    @Test
    public void checkTriangleTest5() {
        double a = 13, b = 24, c = 999;
        String expRes = "can't exist";
        String actRes = Triangles.checkTriangle(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }

}
