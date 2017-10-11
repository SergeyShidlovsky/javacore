package com.kitcenter.app.classwork.lesson12;

/**
 * Created by Nastya on 10.10.2017.
 */
public class Bicycle {

    private String type;
    private String mark;
    private int year;
    private int wheelSize;
    private String color;

    //Constructor with no args
    public Bicycle(){
        this.wheelSize = 21;
        this.color = "red";
    }
    //constructor that Srting ant Integer args
    public Bicycle(int wheelSize, String color){
        this.wheelSize = wheelSize;
        this.color = color;
    }
    //Constructor with Integer args that calls no-args constructor by method this()
    public Bicycle(int wheelSize){
        this();
        this.wheelSize = wheelSize;
    }

    //Constructor with Integer args that calls Bicyvle(int wheelSize() constructor by method this(int wheelSize)
    public Bicycle(String type, String mark, int wheelSize, int year){
        this(wheelSize);
        this.wheelSize = wheelSize;
        this.mark = mark;
        this.type = type;
        this.year = year;
    }

    //Just Method
    public String ride(){

        return "Wroom";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
