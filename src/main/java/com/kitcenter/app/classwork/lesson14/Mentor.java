package com.kitcenter.app.classwork.lesson14;

import com.kitcenter.app.classwork.lesson13.Teacher;

/**
 * Created by Nastya on 17.10.2017.
 */
public class Mentor extends Teacher {

    public Mentor(String name, String university) {
        super(name, university);
    }

    @Override
    public String lessonFinished() {
        return "Lesson is Not finished";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
