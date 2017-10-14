package com.kitcenter.app.homework.lesson13.bicycle;

import com.kitcenter.app.homework.lesson13.bicycle.Bicycle;

/**
 * Created by Nastya on 14.10.2017.
 */
public class CustomBicycle extends Bicycle {

    @Override
    public void setSpeed( int speed){
        super.setSpeed(speed);
        System.out.println("Speed is " + speed);
    }

    @Override
    public void setGear(int gear) {
        super.setGear(gear);
        System.out.println("Gear is " + gear);
    }

    @Override
    public void getGear() {
        super.getGear();
    }

    public void ride(){
        System.out.println("Wshhhh!!!!");
    }

}
