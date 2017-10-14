package com.kitcenter.runners.homework.lesson4;

import com.kitcenter.app.homework.lesson4.PrimitiveConvertor;

import java.util.Scanner;

/**
 * Created by Nastya on 14.09.2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {

        //Launching running of lesson 3
        runLesson3Runner();
    }

    //Method that implements running logic of Lesson3Runner class
    public static void runLesson3Runner(){

        System.out.println("Lets convert primitives");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter FLOAT number");
        float f = scanner.nextFloat();

        System.out.println("Please enter INTEGER number");
        int i = scanner.nextInt();

        System.out.println("Please enter CHARACTER ASCII number");
        byte c1 = scanner.nextByte();

        scanner.close();

        char c = (char) c1;

        PrimitiveConvertor pc = new PrimitiveConvertor(i , f, c);

        pc.floatToChar(f);
        pc.charToInt(c);
        pc.intToChar(i);
    }
}
