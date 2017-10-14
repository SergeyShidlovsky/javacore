package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.Human;

/**
 * Created by Nastya on 11.10.2017.
 */
public class HumanRunner {

    public static void main(String[] args) {

        //Run method with main logic
        runHumanRunning();
    }

    //method with main running logic
    public static void runHumanRunning(){

        //Describe desirable person
        String name = "Vasiliy Petrovich";
        int age  = 75;

        //Crete human object by setting name and age
        Human human = new Human(name,age);

        //Let's set new age of person using correct data
        age = (int) (Math.random()* 119 + 1 ) ;
        System.out.println(human.setAge(age) + " for " + human.getName());

        //let's set new age of person using incorrect data
        age = (int) (Math.random()* 120 + 120 ) ;
        System.out.println(human.setAge(age) + " for " + human.getName());

    }

}
