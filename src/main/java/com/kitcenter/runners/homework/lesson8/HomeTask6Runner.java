package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask6;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask6Runner {
    public static void main(String[] args) {

        //Launching Home task 6
        runHomeTask6Runner();
    }

    public static void runHomeTask6Runner(){
        HomeTask6 task6 = new HomeTask6();

        task6.fillRndValues();
        task6.alignToRight();
    }
}
