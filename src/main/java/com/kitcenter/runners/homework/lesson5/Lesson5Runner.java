package com.kitcenter.runners.homework.lesson5;

import java.util.Scanner;

/**
 * Created by Nastya on 25.10.2017.
 */
public class Lesson5Runner {
    public static void main(String[] args) {

        //Launching lesson5Ruuner
        runLesson5Ruuner();

    }

    public static void runLesson5Ruuner(){
        System.out.println("Please insert: " +
                "\n - 1 to Run Calcutation " +
                "\n - 2 to Run Registration ");

        Scanner scanner = new Scanner(System.in);
        int launcher = scanner.nextInt();

        switch (launcher) {
            case 1 :{
                CalculationRunner.runCalculationRunner();
                break;
            }
            case 2: {
                RegistrationRunner.runRegistrationRunner();
            }

        }
    }
}
