package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask2;

/**
 * Created by Nastya on 24.09.2017.
 */
public class HomeTask2Runner {
    public static void main(String[] args) {

        //Launching home task
        runHomeTask2Runner();

    }

    public static void runHomeTask2Runner(){
        HomeTask2 task2 = new HomeTask2();

        task2.fillMassive();
        task2.showMassive();
        task2.revertMassive();
    }
}
