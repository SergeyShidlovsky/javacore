package com.kitcenter.app.homework.lesson8;

import java.util.Arrays;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask5 {

    //Initializing array
    int arr[][] = new int[8][5];

    //Method for filling array
    public void fillRandomValues() {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 4; j++) {
                arr[i][j] = (int) ((Math.random() * 90) + 10);
                System.out.println(arr[i][j] + " ");
            }
        }
    }

    //Method that prints array
    public void showArrayInString() {
        System.out.println("Here is an array");
        for (int i = 0; i <= 7; i++) {
            System.out.println();
            for (int j = 0; j <= 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}