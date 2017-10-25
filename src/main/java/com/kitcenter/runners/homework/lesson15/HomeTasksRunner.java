package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.HomeTasks;
import com.kitcenter.runners.homework.lesson12.Lesson12Runner;
import com.kitcenter.runners.homework.lesson13.Lesson13Runner;
import com.kitcenter.runners.homework.lesson4.Lesson3Runner;
import com.kitcenter.runners.homework.lesson5.CalculationRunner;
import com.kitcenter.runners.homework.lesson5.Lesson5Runner;
import com.kitcenter.runners.homework.lesson6.Lesson6Runner;
import com.kitcenter.runners.homework.lesson8.Lesson8Runner;
import com.kitcenter.runners.homework.lesson9.Lesson9Runner;

import java.util.Scanner;

/**
 * Created by Nastya on 25.10.2017.
 */
public class HomeTasksRunner {

    public static void main(String[] args) {

        //Scanning lesson caption
        String data = scanning();

        //Checking lesson number and launching corresponded home task
        try {
            launchHomeTask(data);
        } catch (IllegalArgumentException e) {

            System.out.println("Please Insert correct home task name");
            System.out.println("Exit from Menu? **Y** - YES,  **N** - NO");
            //Scanning the response
            String response = scanning();
            if (response.toUpperCase().equals("Y")){
                System.out.println("Exit from program");
                //exit
            }else {
                data = scanning();
                launchHomeTask(data);
            }
        }
    }

    //Method that catchs exception and offers to user exit from programm
    //or relaunch HomeTask launcher
    public static void solveException(){

    }


    //Method that performs scanning
    public static String scanning(){
        System.out.println("Please enter number of HOME TASK by word");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        return data;
    }

    //Method that performs launching corresponded lesson
    public static void launchHomeTask(String data){
        HomeTasks homeTask = HomeTasks.valueOf(data.toUpperCase());
        switch (homeTask) {
            case ONE:
                System.out.println("===========HOME TASK 1==============");
                System.out.println("Home task was completed without coding");
                break;
            case TWO:
                System.out.println("===========HOME TASK 2==============");
                System.out.println("Home task was completed without coding");
                break;
            case THREE:
                System.out.println("===========HOME TASK 3==============");
                System.out.println("Home task was completed without coding");
                break;
            case FOUR:
                System.out.println("===========HOME TASK 4==============");
                Lesson3Runner.runLesson3Runner();
                break;
            case FIVE:
                System.out.println("===========HOME TASK 5==============");
                Lesson5Runner.runLesson5Ruuner();
                break;
            case SIX:
                System.out.println("===========HOME TASK 6==============");
                Lesson6Runner.runLesson6runner();
                break;
            case SEVEN:
                System.out.println("===========HOME TASK 7==============");
                System.out.println("Home task was completed without coding");
                break;
            case EIGTH:
                System.out.println("===========HOME TASK 8==============");
                Lesson8Runner.runLesson8Runner();
                break;
            case NINE:
                System.out.println("===========HOME TASK 9==============");
                Lesson9Runner.runLesson9Runner();
                break;
            case TEN:
                System.out.println("===========HOME TASK 10==============");
                System.out.println("Haven't Implemented yet");
                break;
            case ELEVEN:
                System.out.println("===========HOME TASK 11==============");
                System.out.println("Haven't Implemented yet");
                break;
            case TWELVE:
                System.out.println("===========HOME TASK 12==============");
                Lesson12Runner.runLesson12Runner();
                break;
            case THIRTEEN:
                System.out.println("===========HOME TASK 13==============");
                Lesson13Runner.runLesson13Runner();
                break;
            case FOURTEEN:
                System.out.println("===========HOME TASK 14==============");
                System.out.println("Haven't Implemented yet");
                break;
            case SIXTEEN:
                System.out.println("===========HOME TASK 15==============");
                System.out.println("Haven't Implemented yet");
                break;
            }
        }
}

