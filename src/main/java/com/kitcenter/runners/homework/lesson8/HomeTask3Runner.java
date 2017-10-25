package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask3;

/**
 * Created by Nastya on 25.09.2017.
 */
public class HomeTask3Runner {
    public static void main(String[] args) {

       //Launching home task
        runHomeTask3Runner();
    }

    public static void runHomeTask3Runner(){

        HomeTask3 task3 = new HomeTask3();

        task3.fillArrayRandom();
        task3.showArrayToString();
        task3.countEvenNumbers();
    }
}
