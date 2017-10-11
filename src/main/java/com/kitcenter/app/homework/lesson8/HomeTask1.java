package com.kitcenter.app.homework.lesson8;

import java.util.Arrays;

/**
 * Created by Nastya on 24.09.2017.
 */
public class HomeTask1 {

    //Initialize massive
    int[] arr = new int[11];

    //Method for an array creation
    public void createArray(){

        //Initialize first number of massive
        int number = 0;
        //Filling array by numbers
        for (int i = 0; i <= (arr.length -1); i++){
            arr[i] = number;
            number = number + 2;
        }
    }

    //Method that shows array in string
    public void showArrayString(){
        System.out.println("There are 2 way for showing array in one string" +
                            "\n first is arrayToString() method");
        System.out.println(Arrays.toString(arr));
        System.out.println("The second way is to print each elemen of massive after each loop iiteration");

        System.out.print("[ ");
        for (int i = 0 ; i <= (arr.length - 1); i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    //Method that shows arrya in colonum
    public void showArrayColonum(){
        System.out.println("Let's print in colonum each element of massive after each loop iteration");

        for (int i = 0 ; i <= (arr.length - 1); i++ ){
            System.out.println(arr[i]);
        }
    }
}
