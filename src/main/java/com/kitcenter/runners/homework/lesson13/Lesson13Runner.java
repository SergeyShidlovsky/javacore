package com.kitcenter.runners.homework.lesson13;

import com.kitcenter.app.homework.lesson13.bicycle.Bicycle;
import com.kitcenter.app.homework.lesson13.bicycle.BicycleWithRing;
import com.kitcenter.app.homework.lesson13.bicycle.BicycleWithRingInterface;
import com.kitcenter.app.homework.lesson13.bicycle.CustomBicycle;

/**
 * Created by Nastya on 14.10.2017.
 */
public class Lesson13Runner {

    public static void main(String[] args) {

        //Running program
        runLesson13Running();

    }

    //Method with running logic
    public static void runLesson13Running() {

        runRide();
        runSetGiarAndRide();
    }

    //Method that call method ride() from reference BicycleWithRingInrterface
    public static void runRide(){

        //Creating object bikeWithRing
        // using constructor from BicycleWithRing()
        BicycleWithRingInterface bikeWithRing = new BicycleWithRing();

        bikeWithRing.ring();
    }

    //Method that calls method setGear() and ride() from object CustomBicycle
    //from reference of class Bicycle
    public static void runSetGiarAndRide(){

        //Creating object bike
        // using constructor from CustomBicycle()
        Bicycle bike  = new CustomBicycle();
        bike.setGear(12);
        bike.ride();
    }
}
