package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.Person;
import com.kitcenter.app.classwork.lesson12.Student;

/**
 * Created by Nastya on 10.10.2017.
 */
public class StudentRunning {

    public static void main(String[] args) {

        Student student = new Student("Vasia");

        System.out.println( " Default Student is " + student.getName());
        student.setName(" Another student is entering into clssroom");
        student.setName("Petia");
        System.out.println("Second Student is " + student.getName());
        System.out.println("Vasia asks What is your name");
        student.setResponce("What is your name");
        student.setResponce( "Petia asks " + student.getResponce());
    }


}
