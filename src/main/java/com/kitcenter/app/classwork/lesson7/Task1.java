package com.kitcenter.app.classwork.lesson7;

/**
 * Created by Nastya on 21.09.2017.
 */
public class Task1 {



    public void compare(int a, int b) {
            do {
                if (a > b ) {
                    a--;
                    System.out.print(a + " ");
                } else if (a <= b) {
                    System.out.println(" ");
                    System.out.print( a + " " + b);
                }
            }while (a > b) ;
    }
}
