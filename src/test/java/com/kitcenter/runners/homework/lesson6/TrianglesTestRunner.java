package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.TrianglesTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Nastya on 05.10.2017.
 */
public class TrianglesTestRunner {

    public static void main(String[] args) {


        Result result = JUnitCore.runClasses(TrianglesTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("All Unit Test have been passed - it's " + result.wasSuccessful());
    }
}
