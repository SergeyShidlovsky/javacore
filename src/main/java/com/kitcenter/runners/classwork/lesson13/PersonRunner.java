package com.kitcenter.runners.classwork.lesson13;

import com.kitcenter.app.classwork.lesson13.Teacher;
import com.kitcenter.app.classwork.lesson13.Person;
import com.kitcenter.app.classwork.lesson13.Student;

/**
 * Created by Nastya on 12.10.2017.
 */
public class PersonRunner {
    public static void main(String[] args) {
        Student student = new Student("Sergey", "NTUU \"Sykorsky KPI\" ");
        System.out.println(student.getResponce("What is the class?"));

        Teacher teacher = new Teacher("Teacher", "NTUU \"Sykorsky KPI\" ");
        System.out.println(teacher.getResponce("What time is now?"));

        Person person = new Student("Sergey", "NTUU \"Sykorsky KPI\" ");
        System.out.println(person.getResponce("What is the class?"));

        person = new Teacher("Teacher", "NTUU \"Sykorsky KPI\" ");
        System.out.println(person.getResponce("What time is now?"));
    }
}
