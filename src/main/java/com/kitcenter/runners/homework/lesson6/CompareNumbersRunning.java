package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.EvenOdd;

/**
 * Created by Nastya on 03.10.2017.
 */
public class EvenOddRunning {

    public static void main(String[] args) {

        EvenOdd eo = new EvenOdd();

        System.out.println("Please insert first integer number");
        int a = eo.scanningInt();
        System.out.println("Please insert second integer number");
        int b = eo.scanningInt();

        System.out.println( eo.checkEven(a , b));

    }
}
