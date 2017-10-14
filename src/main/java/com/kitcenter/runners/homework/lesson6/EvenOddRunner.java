package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.EvenOdd;

/**
 * Created by Nastya on 03.10.2017.
 */
public class EvenOddRunner {

    public static void main(String[] args) {

        runEvenOdd();

    }

    public static void runEvenOdd() {

        EvenOdd eo = new EvenOdd();

        System.out.println("Please Insert Number");
        double a = eo.scanningDouble();
        System.out.println("Number is " + eo.checkEven(a));

    }
}
