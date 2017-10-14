package com.kitcenter.runners.classwork.lesson7;

import com.kitcenter.app.classwork.lesson7.EvenCounter;

import java.util.Scanner;

/**
 * Created by Nastya on 21.09.2017.
 */
public class EvenCounterRunning {

    public static void main(String[] args) {
        EvenCounter count = new EvenCounter();

        Scanner scan = new Scanner(System.in);
        System.out.println("First number");
        int a = scan.nextInt();
        System.out.println("Second number");
        int b = scan.nextInt();
        scan.close();

        count.counter(a, b);
    }
}
