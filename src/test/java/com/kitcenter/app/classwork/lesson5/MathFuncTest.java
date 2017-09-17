package com.kitcenter.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 14.09.2017.
 */
public class MathFuncTest {

    @Test
    public void multipleTest(){
        int a = 1;
        int b = 2;
        int expRes = 2;
        int actRes = MathFunc.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }

}
