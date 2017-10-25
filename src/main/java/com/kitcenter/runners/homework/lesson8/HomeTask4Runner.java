package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask4;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask4Runner {

    public static void main(String[] args) {

        //Launching Home task4
        runHomeTask4Runner();
    }

    public static void runHomeTask4Runner(){

        HomeTask4 task4 = new HomeTask4();

        task4.fillRandomValues();
        task4.showArrayInString();
        task4.printMinAndMax();
    }
}
