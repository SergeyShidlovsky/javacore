package com.kitcenter.app.homework.lesson5;

/**
 * Created by Nastya on 18.09.2017.
 */
public class Calculation {


    public static int multiply(int a , int b){
        int result = a * b;
        return result;
    }

    public static double addition( int a , int b){
        double result = (double)  (a + b);
        return result;
    }

    public static double  divide( double a , double b){
        if ( b != 0){
            double result = ( a / b);
            return result;
        } else {
            return 0;
        }
    }

    public static double elevate(int a , int b){
        double result;
        if (a == 0 && b == 0){
            return 1;
        } else if (a == 0 && b != 0) {
            return 0;
        } else if (a != 0 && b == 0 ) {
            return 1;
        } else if (a != 0 && b < 0 ){
            double c = 1;
            for (int i = 1 ; i <= -(1 * b ); i++){
                c = c * a;
            }
            result = 1 / c;
            return result;
        } else {
            double c = 1;
            for (int i = 1 ; i <= b; i++){
                c = c * a;
            }
            result = c;
            return result;
        }

    }
}
