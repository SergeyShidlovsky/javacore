package com.kitcenter.app.classwork.lesson13;

/**
 * Created by Nastya on 10.10.2017.
 */
public class Person {

    protected String name;

    public Person (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponce(String question) {
        return "My answer is " + question;
    }
}
