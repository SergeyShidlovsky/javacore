package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Lesson;
import com.kitcenter.runners.homework.lesson5.CalculationRunner;
import com.kitcenter.runners.homework.lesson9.Lesson9Runner;

import java.util.Scanner;


/**
 * Created by Nastya on 19.10.2017.
 */
public class LessonRunner {

    public static void main(String[] args) {

        //This home task launcher is not full and will not be restarted after invalid value input

        //Scanning lesson caption
        String data = scanning();
        
        //Cheming lesson number and launching corresponded home task if value have been input correctly
        try {
            Lesson lesson = Lesson.valueOf(data.toUpperCase());
            switch (lesson) {
                case FIVE:
                    System.out.println("===========HOME TASK 5==============");
                    CalculationRunner.runCalculationRunner();
                    break;
                case NINE:
                    System.out.println("===========HOME TASK 9==============");
                    Lesson9Runner.runLesson9Runner();
                    break;
            }
        } catch ( IllegalArgumentException e) {

            System.out.println("Please Insert correct home task name");

        }
    }

    public static String scanning(){
        System.out.println("Please enter number of HOME TASK by word");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        return data;
    }
}
