package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.CompareNumbers;

/**
 * Created by Nastya on 03.10.2017.
 */
public class CompareNumbersRunning {

    public static void main(String[] args) {

        runCompareNumbers();

    }

    public static void runCompareNumbers(){

        CompareNumbers cn = new CompareNumbers();

        System.out.println("Please insert first number");
        double a = cn.scanningDouble();
        System.out.println("Please insert second number");
        double b = cn.scanningDouble();

        System.out.println( cn.checkBigger(a , b));

    }
}
