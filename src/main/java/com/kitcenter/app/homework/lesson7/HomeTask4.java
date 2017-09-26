package com.kitcenter.app.homework.lesson7;

import java.util.Arrays;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask4 {

    //Создайте массив из 15 случайных целых чисел из отрезка [0;999].
    // Выведите массив на экран. Выведите минимальное и максимальное
    // значение элементов массива

    //Initializing array
    int arr []  = new int [15];

    //Metod for filling array
    public void fillRandomValues(){
        for (int i = 0; i <= (arr.length -1); i++){
            arr[i] = (int) (Math.random()*1000);
        }
    }

    //Method that prints array to string
    public void showArrayInString(){
        System.out.println(Arrays.toString(arr));
    }

    //Method that shows maximal and minimal elements of array
    public void printMinAndMax(){

        int maximal = arr[arr.length - 1];
        //Loop for maximal value finding
        for (int i = 0; i < ((arr.length - 2)); i++){
            if (arr[i] >= arr[i + 1] && arr[i] >= maximal){
                maximal = arr[i];
            }else {
                maximal = maximal;
            }
        }
        System.out.println("Maximal value  = " + maximal);

        int minimal = arr[arr.length - 1];
        //Loop for minimal value finding
        for (int i = 0; i < ((arr.length - 2)); i++){
            if (arr[i] < arr[i + 1] && arr[i] < minimal){
                minimal = arr[i];
            } else{
                minimal = minimal;
            }
        }
        System.out.println("Minimal value = " + minimal);
    }

}
