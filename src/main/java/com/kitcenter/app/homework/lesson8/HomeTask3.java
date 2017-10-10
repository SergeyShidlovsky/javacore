package com.kitcenter.app.homework.lesson7;

import java.util.Arrays;

/**
 * Created by Nastya on 25.09.2017.
 */
public class HomeTask3 {

    //Initializing array
    public int [] array = new int [15];

    //Metod for filling array
    public void fillArrayRandom(){
        for (int i = 0; i <= (array.length -1); i++){
            array[i] = (int) (Math.random()*10);
        }
    }

    //Method that prints array to string
    public void showArrayToString(){
        System.out.println(Arrays.toString(array));
    }

    //Method that counts even numbers of array
    public void countEvenNumbers(){
        int evens = 0;
        for(int i = 0; i <= (array.length - 1); i++){
            if(array[i] % 2 == 0 ){
                evens++;
            }
        }
        System.out.println("Quantity of even elements  = " + evens);
    }
}
