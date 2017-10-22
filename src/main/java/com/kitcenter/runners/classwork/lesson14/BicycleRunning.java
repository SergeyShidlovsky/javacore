package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.Bicycle;
import com.kitcenter.app.classwork.lesson14.NewBicycle;

/**
 * Created by Nastya on 17.10.2017.
 */
public class BicycleRunning {

    public static void main(String[] args) {
        runBicycleRunning();

        System.out.println();
    }

    public static void runBicycleRunning(){

        Bicycle bikeRed = new NewBicycle();
        bikeRed.changeCadence(4);
        bikeRed.changeGear(4);
        bikeRed.changeColor("RED");

        Bicycle bikeGreen = new NewBicycle();
        bikeGreen.changeCadence(5);
        bikeGreen.changeGear(5);
        bikeGreen.changeColor("GREEN");

        System.out.println();
    }
}
