package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 03.10.2017.
 */
public class EvenOdd {

    //Method that is scanning data from keyboard
    public static double scanningDouble() {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        return value;
    }

    //Method that is checking if number is even
    public static String checkEven(double a) {
        if(a % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
