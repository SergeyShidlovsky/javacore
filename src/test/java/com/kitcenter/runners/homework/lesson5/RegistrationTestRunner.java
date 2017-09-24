package com.kitcenter.runners.homework.lesson5;

import com.kitcenter.app.homework.lesson5.RegistrationTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Nastya on 24.09.2017.
 */
public class RegistrationTestRunner {
    public static void main(String[] args) {


    Result result2 = JUnitCore.runClasses(RegistrationTest.class);

        for (Failure failure :  result2.getFailures()) {
        System.out.println(failure.toString());
    }
        System.out.println("======================================================");
        System.out.println("All Unit Test have been passed - it's " + result2.wasSuccessful());
        System.out.println("======================================================");
    }
}
