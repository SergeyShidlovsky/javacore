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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        return university != null ? university.equals(teacher.university) : teacher.university == null;
    }

    @Override
    public int hashCode() {
        return university != null ? university.hashCode() : 0;
    }
}
