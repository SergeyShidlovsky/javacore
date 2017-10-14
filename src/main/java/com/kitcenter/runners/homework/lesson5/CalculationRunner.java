package com.kitcenter.runners.homework.lesson5;

import com.kitcenter.app.homework.lesson5.Calculation;

/**
 * Created by Nastya on 18.09.2017.
 */
public class CalculationRunning {

    public static void main(String[] args) {
        Calculation c = new Calculation();
        int a = 2;
        int b = -3;

        System.out.println(c.multiply(a , b));
        System.out.println(c.addition(a , b));
        System.out.println(c.divide(a , b));
        System.out.println(c.elevate(a , b));

    }
}
