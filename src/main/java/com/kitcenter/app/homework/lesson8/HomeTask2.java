package com.kitcenter.app.homework.lesson7;

import java.util.Arrays;

/**
 * Created by Nastya on 24.09.2017.
 */
public class HomeTask2 {

    //Initializing  array with
    public int [] array = new int[50];

    //Method that fills massive by desired numbers
    public void fillMassive(){
        //Initialize first number of massive
        int number = 1;
        //Filling array by numbers
        for (int i = 0; i <= (array.length -1); i++){
            array[i] = number;
            number = number + 2;
        }
    }

    //Method that shows massive in sting
    public void showMassive(){
        System.out.println("Initial array");
        System.out.println(Arrays.toString(array));
    }

    //Method that reverts array
    public void revertMassive(){
        System.out.println("Reveted array");
        int temp = 0;
        for (int i = 0; i <= ((array.length - 1) / 2); i++){
            temp = array[i];
            array[i] = array[(array.length - 1) - i ];
            array[(array.length - 1) - i ] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
