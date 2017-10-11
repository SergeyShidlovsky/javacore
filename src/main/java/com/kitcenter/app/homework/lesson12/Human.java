package com.kitcenter.app.homework.lesson12;

/**
 * Created by Nastya on 11.10.2017.
 */
public class Human {

    //Main classfields
    private String name;
    private int age;

    //Constructor that get's 2 params
    public Human(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //Method for get name
    public String getName() {
        return name;
    }

    //Method for get age
    public int getAge() {
        return age;
    }

    //Method for set age with data validation
    public String setAge(int age) {
        String message;
        if (age > 0 && age <= 120){
            this.age = age;
            message = "New age " + age + " has been set";
        } else {
            message = "Age " + age + " is invalid";
        }
        return message;
    }
}
