package com.kitcenter.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by Nastya on 12.09.2017.
 */
public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first radius");
        double radius1 = scanner.nextDouble();
        System.out.println("Please insert second radius");
        double radius2 = scanner.nextDouble();
        scanner.close();

        double circleArea1 = 3.14 * (radius1*radius1);
        System.out.println("First Area is " + circleArea1 + "m2");
        double circleArea2 = 3.14 * (radius2*radius2);
        System.out.println("Second Area is " + circleArea2 + "m2");

        System.out.println("Let's compare");
        if (circleArea1 > circleArea2){
            System.out.println("First Area equls " + circleArea1 + " m2 and is bigger" +
                    " then Second Area which is equals " + circleArea2 );
        }else{
            System.out.println("Second Area equls " + circleArea2 + " m2 and is bigger" +
                    " then First Area which is equals " + circleArea1 );
        }
    }
}
