package com.kitcenter.app.classwork.lesson14;

/**
 * Created by Nastya on 17.10.2017.
 */
public class NewBicycle implements Bicycle {

    private int cadence;
    private int gear;
    private String color;


    @Override
    public void changeCadence(int newValue) {
        setCadence(cadence);
    }

    @Override
    public void changeGear(int newValue) {
        setGear(gear);
    }

    @Override
    public void changeColor(String value) {
        setColor(color);
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
