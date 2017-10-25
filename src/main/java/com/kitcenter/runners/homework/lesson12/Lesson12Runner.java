package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.runners.homework.lesson9.*;

import java.util.Scanner;

/**
 * Created by Nastya on 28.09.2017.
 */
public class Lesson12Runner {

    public static void main(String[] args) {

     //Running method with running logic
    runLesson12Runner();
    }

    //Method with running logic
    public static void runLesson12Runner(){
        //Introduction of menu
        System.out.println("============================Menu===========================");
        System.out.println("Press 1 to Launch Human Runner ");
        System.out.println("Press 2 to Launch White Collar Runner ");


        //Creating scanner2 object
        Scanner scanner2 = new Scanner(System.in);

        //Giving scanner2 object to exec() method
        exec(scanner2);
    }

    //Method that recieves scanner2 object and
    //causes reset of some class execution after
    //previous class' execution have been completed
    public static void resetExec(Scanner scanner2){
        System.out.println("Do you wan't to exit from program?" +
                "\nPress 3 to exit" +
                "\nPress 1 - 2 to reset running of corresponded class");
        exec(scanner2);
    }

    //Method that recieves scanner2 object and
    //causes reset of progrram if some character
    //have been input instead integers 1 - 2
    public static void resetAfterIncorrectData(Scanner scanner2){
        System.out.println("You have input 0 or invalid character/string" +
                "\nPress 3 to exit" +
                "\nPress 1 - 2 to reset running of corresponded class");
        //Method nextLine() is used to prevent Stack Overflow exception caused internal methods of  Scanner class
        scanner2.nextLine();
        exec(scanner2);
    }

    //Method that recieves a scanner2 object and executes all classes in current package
    public static void exec( Scanner scanner2 ){
        if (scanner2.hasNextInt()) {
            int choice = scanner2.nextInt();
            if (choice > 0 && choice <= 3) {
                switch (choice) {
                    case 1:
                        HumanRunner.runHumanRunning();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 2:
                        WhiteCollarRunner.runWhiteCollarRunning();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 3:
                        System.out.println("Exiting from program");
                        break;
                }
            } else {
                System.out.println("Please select valid class.");
                //Reloading object to method for next execution
                resetAfterIncorrectData(scanner2);
            }
        } else {

            System.out.println("Please select valid class");
            //Reloading object to method for next execution
            resetAfterIncorrectData(scanner2);
        }
    }

}

