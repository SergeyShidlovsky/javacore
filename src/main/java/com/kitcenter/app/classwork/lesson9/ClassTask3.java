package com.kitcenter.app.classwork.lesson9;

/**
 * Created by Nastya on 28.09.2017.
 */
public class ClassTask3 {

    //Method that converts  of chars to Srting
    public void arrToString(char [] arr){
        String showString  = "";
        for (int i = 0; i < (arr.length - 1 ); i++) {
            showString += arr[i];
        }
        System.out.print(showString);
    }
}
