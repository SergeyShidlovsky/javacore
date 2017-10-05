package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.CircleArea;

/**
 * Created by Nastya on 01.10.2017.
 */
public class CircleAreaRunning {
    public static void main(String[] args) {

        runCircleArea();

    }

    public static void runCircleArea(){

        //Create object on the base of following class
        CircleArea ca = new CircleArea();

        //Scanning first radius
        double radius1 = ca.scanningRadius();
        System.out.println("First radius is " + radius1 );

        //Scanning second radius
        double radius2 = ca.scanningRadius();
        System.out.println("Second radius is " + radius2);

        //Area1 calculation
        double circleArea1 = ca.calcuate(radius1);
        System.out.println("Area 1 has " + circleArea1 + "m2");

        //Area2 calculation
        double circleArea2 = ca.calcuate(radius2);
        System.out.println("Area 2 has " + circleArea2 + "m2");

        //Comparing Areas
        System.out.println(ca.compare(circleArea1, circleArea2) + " m2");

    }
}
