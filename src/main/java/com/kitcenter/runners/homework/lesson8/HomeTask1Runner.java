package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.HomeTask1;

/**
 * Created by Nastya on 24.09.2017.
 */
public class HomeTask1Runner {
    public static void main(String[] args) {

        runHomeTask1Runner();
    }

    public static void runHomeTask1Runner(){
        HomeTask1 ht = new HomeTask1();

        ht.createArray();
        ht.showArrayString();
        ht.showArrayColonum();

    }
}
