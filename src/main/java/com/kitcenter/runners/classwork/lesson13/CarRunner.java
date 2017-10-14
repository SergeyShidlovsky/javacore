package com.kitcenter.runners.classwork.lesson13;

import com.kitcenter.app.classwork.lesson13.Car;
import com.kitcenter.app.classwork.lesson13.Engine;

/**
 * Created by Nastya on 12.10.2017.
 */
public class CarRunner {

    public static void main(String[] args) {

        //Creation of new engine
        Engine v12  = new Engine();
        v12.setName("V12");

        //Creation of new Car
        Car bmw = new Car();

        //Setting engive V12 to Car bmw
        bmw.setEngine(v12);
        System.out.println(bmw.getEngine().getName());

    }
}
