package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.runners.homework.lesson9.*;

import java.util.Scanner;

/**
 * Created by Nastya on 28.09.2017.
 */
public class Lesson8Runner {

    public static void main(String[] args) {

     //Running method with running logic
    runLesson8Runner();
    }

    //Method with running logic
    public static void runLesson8Runner(){
        //Introduction of menu
        System.out.println("============================Menu===========================");
        for (int i = 0; i < 7; i++) {
            System.out.println("Press " + ( i + 1 ) + " - Run Home Task " + ( i + 1 ) );
        }

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
                "\nPress 8 to exit" +
                "\nPress 1 - 8 to reset running of corresponded class");
        exec(scanner2);
    }

    //Method that recieves scanner2 object and
    //causes reset of progrram if some character
    //have been input instead integers 1 - 7
    public static void resetAfterIncorrectData(Scanner scanner2){
        System.out.println("You have input 0 or invalid character/string" +
                "\nPress 8 to exit" +
                "\nPress 1 - 7 to reset running of corresponded class");
        //Method nextLine() is used to prevent Stack Overflow exception caused internal methods of  Scanner class
        scanner2.nextLine();
        exec(scanner2);
    }

    //Method that recieves a scanner2 object and executes all classes in current package
    public static void exec( Scanner scanner2 ){
        if (scanner2.hasNextInt()) {
            int choice = scanner2.nextInt();
            if (choice > 0 && choice <= 8) {
                switch (choice) {
                    case 1:
                        HomeTask1Runner.runHomeTask1Runner();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 2:
                        HomeTask2Runner.runHomeTask2Runner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 3:
                        HomeTask3Runner.runHomeTask3Runner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 4:
                        HomeTask4Runner.runHomeTask4Runner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 5:
                        HomeTask5Runner.runHomeTask5Runner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 6:
                        HomeTask6Runner.runHomeTask6Runner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 7:
                        HomeTask7Runner.runHomeTask7Runner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 8:
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

