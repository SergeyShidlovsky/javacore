package com.kitcenter.app.classwork.lesson13;


/**
 * Created by Nastya on 10.10.2017.
 */
public class Teacher extends Person {

    private String university;

    public Teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public String lessonFinished(){
        return "Do not forget to make homework";
    }
}
