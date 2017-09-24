package com.kitcenter.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nastya on 18.09.2017.
 */
public class RegistrationTest {

    @Test
    public void validationTest1() {
            String expRes =  "[C, C, C, C, C, C, C, C, C, C, C, C, C]";
            String actRes = Registration.validation( "Login", "Password" );
            Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void validationTest2() {
        String expRes =  "[C, C, C, C, C, !]";
        String actRes = Registration.validation( "Login", "!" );
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void validationTest3() {
        String expRes =  "[C, C, C, C, C, #]";
        String actRes = Registration.validation( "Login", "#" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest4() {
        String expRes =  "[C, C, C, C, C, $]";
        String actRes = Registration.validation( "Login", "$" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest5() {
        String expRes =  "[C, C, C, C, C, %]";
        String actRes = Registration.validation( "Login", "%" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest6() {
        String expRes =  "[C, C, C, C, C, ^]";
        String actRes = Registration.validation( "Login", "^" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest7() {
        String expRes =  "[C, C, C, C, C, &]";
        String actRes = Registration.validation( "Login", "&" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest8() {
        String expRes =  "[C, C, C, C, C, *]";
        String actRes = Registration.validation( "Login", "*" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest9() {
        String expRes =  "[C, C, C, C, C, (]";
        String actRes = Registration.validation( "Login", "(" );
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void validationTest10() {
        String expRes =  "[C, C, C, C, C, )]";
        String actRes = Registration.validation( "Login", ")" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest11() {
        String expRes =  "[C, C, C, C, C, _]";
        String actRes = Registration.validation( "Login", "_" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest12() {
        String expRes =  "[C, C, C, C, C, -]";
        String actRes = Registration.validation( "Login", "-" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest13() {
        String expRes =  "[C, C, C, C, C, =]";
        String actRes = Registration.validation( "Login", "=" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest14() {
        String expRes =  "[C, C, C, C, C, +]";
        String actRes = Registration.validation( "Login", "+" );
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void validationTest15() {
        String expRes =  "[C, C, C, C, C, {]";
        String actRes = Registration.validation( "Login", "{" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest16() {
        String expRes =  "[C, C, C, C, C, []";
        String actRes = Registration.validation( "Login", "[" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest17() {
        String expRes =  "[C, C, C, C, C, }]";
        String actRes = Registration.validation( "Login", "}" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest18() {
        String expRes =  "[C, C, C, C, C, ]]";
        String actRes = Registration.validation( "Login", "]" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest19() {
        String expRes =  "[C, C, C, C, C, ;]";
        String actRes = Registration.validation( "Login", ";" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest20() {
        String expRes =  "[C, C, C, C, C, :]";
        String actRes = Registration.validation( "Login", ":" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest21() {
        String expRes =  "[C, C, C, C, C, \"]";
        String actRes = Registration.validation( "Login", "\"" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest22() {
        String expRes =  "[C, C, C, C, C, ']";
        String actRes = Registration.validation( "Login", "'" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest23() {
        String expRes =  "[C, C, C, C, C, .]";
        String actRes = Registration.validation( "Login", "." );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest24() {
        String expRes =  "[C, C, C, C, C, /]";
        String actRes = Registration.validation( "Login", "/" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest25() {
        String expRes =  "[C, C, C, C, C, ?]";
        String actRes = Registration.validation( "Login", "?" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest26() {
        String expRes =  "[C, C, C, C, C, >]";
        String actRes = Registration.validation( "Login", ">" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest27() {
        String expRes =  "[C, C, C, C, C, ,]";
        String actRes = Registration.validation( "Login", "," );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest28() {
        String expRes =  "[C, C, C, C, C, <]";
        String actRes = Registration.validation( "Login", "<" );
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void validationTest29() {
        String expRes =  "[C, C, C, C, C, |]";
        String actRes = Registration.validation( "Login", "|" );
        Assert.assertEquals(expRes, actRes);
    }


}
