package com.kitcenter.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 18.09.2017.
 */
public class RegistrationTest {

    @Test
    public void validationTest() {
            String expRes =  "Correct data";
            String actRes = Registration.validation( "A", "F" );
            Assert.assertEquals(expRes, actRes);
    }
}
