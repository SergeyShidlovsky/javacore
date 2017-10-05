package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 12.09.2017.
 */
public class CircleArea {

    //Declaring static variables;
    static double radius1;
    static double radius2;

    //Method that is scanning data from keyboard
    public static double scanningRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert radius");
        double radius = scanner.nextDouble();
        return radius;
    }

    //Method that is calculating area
    public static double calcuate(double radius) {
        double circleArea = 3.14 * (radius * radius);
        return circleArea;
    }

    //Method that is comparing 2 areas
    public static double  compare(double circleArea1, double circleArea2 ) {
        System.out.println("Let's compare");
        if (circleArea1 > circleArea2){
            System.out.print("Circle Area 1 is bigger = ");
            return circleArea1;
        }else if (circleArea1 < circleArea2){
            System.out.print("Circle Area 2 is bigger = ");
            return circleArea2;
        } else {
            System.out.print("Circle Areas are equals = ");
            return circleArea2;
        }
    }
}
