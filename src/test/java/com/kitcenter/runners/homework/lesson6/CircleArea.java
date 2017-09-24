package com.kitcenter.runners.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 21.09.2017.
 */
public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter PI value");
        double pi = scanner.nextDouble();
        scanner.close();

        double circleArea = pi* radius * radius;
        System.out.println("Area is " + circleArea);
    }
}
