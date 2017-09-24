package com.kitcenter.app.classwork.lesson7;

import java.util.Arrays;

/**
 * Created by Nastya on 21.09.2017.
 */
public class Array {

    int b = 10;
    int [] arr = new int[b];

    public void filMassive() {
        System.out.println("Result of fillMassive() method");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()) * 10);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void showMassive(){
        System.out.println("Result of showMassive() method");
        for (int allElement : arr){
            System.out.print(allElement + " ");
        }
        System.out.println();
    }

    public void arrToString(){
        System.out.println("Result of arrToString() method ");
        System.out.println(Arrays.toString(arr));
    }
}

