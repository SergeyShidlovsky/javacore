package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Nastya on 14.09.2017.
 */
public class EvenOrOdd {

    public static void init(){
        System.out.println("Let's compare 2 nubbers");
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert 1 nubber");
        int first = scan.nextInt();
        System.out.println("Insert 2 nubber");
        int second = scan.nextInt();
        scan.close();

        if ((first % second) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

    }
}
