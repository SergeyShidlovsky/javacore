package com.kitcenter.runners.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Nastya on 28.09.2017.
 */
public class Lesson4Runner {

    public static void main(String[] args) {

        //Introduction of menu
        System.out.println("=================Menu================");
        System.out.println("1 - Circle Area calculation");
        System.out.println("2 - Compare 2 numbers");
        System.out.println("3 - Check if number is Even or Odd");
        System.out.println("4 - Check if Egypt triangle can exist");
        System.out.println("5 - Exit from program");
        System.out.println("Entering one of mentioned buttons causes launching corresponded class");

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
                "\nPress 5 to exit" +
                "\nPress 1 - 4 to reset running of corresponded class");
        exec(scanner2);
    }

    //Method that recieves scanner2 object and
    //causes reset of progrram if some character
    //have been input instead integers 1 - 4
    public static void resetAfterIncorrectData(Scanner scanner2){
        System.out.println("You have input 0 or invalid character/string" +
                "\nPress 5 to exit" +
                "\nPress 1 - 4 to reset running of corresponded class");
        //Method nextLine() is used to prevent Stack Overflow exception caused internal methods of  Scanner class
        scanner2.nextLine();
        exec(scanner2);
    }

    //Method that recieves a scanner2 object and executes all classes in current package
    char c;
    public static void exec( Scanner scanner2 ){
        if (scanner2.hasNextInt()) {
            int choice = scanner2.nextInt();
            if (choice > 0 && choice <= 5) {
                switch (choice) {
                    case 1:
                        CircleAreaRunning.runCircleArea();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 2:
                        CompareNumbersRunning.runCompareNumbers();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 3:
                        EvenOddRunning.runEvenOdd();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 4:
                        TrianglesRunning.runTriangles();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 5:
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

