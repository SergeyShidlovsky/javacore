package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 01.10.2017.
 */
public class Triangles {

    //Method that is scanning data from keyboard
    public static double scanningLine() {
        Scanner scanner = new Scanner(System.in);
        double line = scanner.nextDouble();
        return line;
    }

    //Method that checks if triangle can exist
    public static String checkTriangle(double a, double b, double c){

        int max = 0;

        if (a > b && a > c && a > 0 && b > 0 && c > 0 ){
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))){
                return "can exist";
            } else {
                return "can't exist";
            }
        } else if (b > a && b > c && a > 0 && b > 0 && c > 0 ) {
            if (Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2))){
                return "can exist";
            } else {
                return "can't exist";
            }
        } else {
            if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))){
                return "can exist";
            } else {
                return "can't exist";
            }
        }
    }
}
