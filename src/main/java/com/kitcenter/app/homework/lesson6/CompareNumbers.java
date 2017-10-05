package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 14.09.2017.
 */
public class CompareNumbers {

    //Method that is scanning data from keyboard
    public static double scanningDouble() {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        return value;
    }

    //Method that is comparing numbers
    public static String checkBigger(double a, double b) {
        if (a > b) {
            return a + " is bigger";
        } else {
            return b + " is bigger";
        }

    }
}
