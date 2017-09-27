package com.kitcenter.app.homework.lesson7;

/**
 * Created by Nastya on 26.09.2017.
 */


public class HomeTask6 {

    //Initializing array
    int arr[][] = new int[8][5];

    //Method for filling array
    public void fillRndValues() {
        System.out.println("Initial not refactored array");
        for (int i = 0; i <= 7; i++) {
            System.out.println();
            for (int j = 0; j <= 4; j++) {
                arr[i][j] = (int) ((Math.random() * 999) + 1);
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    //Method for elements alignment by right border
    public  void alignToRight(){
        System.out.println("Array with elements alignment by right border");
        for (int i = 0; i <= 7; i++) {
            System.out.print( "Line " + i + " : ");
            for (int j = 0; j <= 4; j++) {
                if (arr[i][j] >= 1 && arr[i][j] < 10 ) {
                    System.out.print( "  " + arr[i][j] + " ");
                } else if (arr[i][j] >= 10 && arr[i][j] < 100 ) {
                    System.out.print( " " + arr[i][j] + " ");
                }else if (arr[i][j] >= 100 && arr[i][j] < 1000 ) {
                    System.out.print( arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }




}



