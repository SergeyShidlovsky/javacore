package com.kitcenter.app.homework.lesson13;

/**
 * Created by Nastya on 14.10.2017.
 */
public abstract class Bicycle {

    private int speed;
    private int gear;

    public void ride(){
        System.out.println("Wroom-Wroom");
    }

    public void setSpeed(int speed) {
        //logic will be implemented in child classes
    }

    public void setGear(int gear) {
        //logic will be implemented in child classes
    }

    public void getGear() {
        //logic will be implemented in child classes
    }
}
