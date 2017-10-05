package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.CircleAreaTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Scanner;

/**
 * Created by Nastya on 21.09.2017.
 */
public class CircleAreaTestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(CircleAreaTest.class);

        for (Failure failure :  result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("All Unit Test have been passed - it's " + result.wasSuccessful());
    }
}
