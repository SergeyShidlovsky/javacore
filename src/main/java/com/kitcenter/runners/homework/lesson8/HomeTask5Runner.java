package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask5;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask5Runner {
    public static void main(String[] args) {

        //Launching home task6
        runHomeTask5Runner();
    }

    public static void  runHomeTask5Runner(){

        HomeTask5 task5 = new HomeTask5();

        task5.fillRandomValues();
        task5.showArrayInString();
    }

}
