package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.Bicycle;

/**
 * Created by Nastya on 10.10.2017.
 */
public class BicycleRunner {

    public static void main(String[] args) {

        Bicycle bicycleOne = new Bicycle();
        bicycleOne.ride();

        Bicycle bicycleTwo= new Bicycle(20,"Blue");
        bicycleTwo.ride();

        Bicycle bicycleThree = new Bicycle(32);
        bicycleThree.ride();

        Bicycle bicycleFour = new Bicycle("Mountain","Yellow",21,2017);
        bicycleFour.ride();
    }



}
