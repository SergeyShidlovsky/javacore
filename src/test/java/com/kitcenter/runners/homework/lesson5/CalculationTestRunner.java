package com.kitcenter.runners.homework.lesson5;

import com.kitcenter.app.homework.lesson5.CalculationTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Nastya on 20.09.2017.
 */
public class CalculationTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculationTest.class);

        for (Failure failure :  result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("All Unit Test have been passed - it's " + result.wasSuccessful());
    }
}
