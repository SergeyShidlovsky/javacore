package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.classwork.lesson5.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Nastya on 19.09.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {

    @Test
    @FileParameters(value = "src\\test\\resources\\dataset.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
    }
}
