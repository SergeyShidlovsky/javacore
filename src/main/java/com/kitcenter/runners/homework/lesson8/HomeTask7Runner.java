package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask7;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask7Runner {
    public static void main(String[] args) {

        //Launch Home Task 7
        runHomeTask7Runner();
    }

    public static void runHomeTask7Runner(){

        HomeTask7 task7 = new HomeTask7();

        System.out.println("Please enter numbers for Array creation");
        System.out.println("If you want to stop number input");
        System.out.println("just enter 'exit' word");

        task7.fillShowAndCount();

    }
}
