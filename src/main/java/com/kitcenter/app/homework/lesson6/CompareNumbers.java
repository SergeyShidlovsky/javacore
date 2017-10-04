package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 14.09.2017.
 */
public class EvenOdd {

    //Method that is scanning data from keyboard
    public static double scanningInt() {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextInt();
        return value;
    }

    //Method that is comparing numbers
    public static String checkBigger(double a,double b) {
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        if ((max % min) == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
