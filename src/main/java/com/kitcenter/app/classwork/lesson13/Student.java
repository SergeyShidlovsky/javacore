package com.kitcenter.app.classwork.lesson13;

/**
 * Created by Nastya on 10.10.2017.
 */
public class Student extends Person {

    private String university;
    private String responce = "Ehhhh, what is the question";

    public Student(String name, String university) {
        super(name); //calls parent(super) class' constructor Student
        this.university = university;
    }

    public String getResponce(String question){
        return responce;

    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getResponce() {
        return responce;
    }

    public void setResponce(String responce) {
        this.responce = responce;
    }
}
