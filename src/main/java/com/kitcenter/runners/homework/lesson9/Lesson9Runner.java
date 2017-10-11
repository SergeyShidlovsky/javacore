package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.runners.homework.lesson6.CircleAreaRunning;
import com.kitcenter.runners.homework.lesson6.CompareNumbersRunning;
import com.kitcenter.runners.homework.lesson6.EvenOddRunning;
import com.kitcenter.runners.homework.lesson6.TrianglesRunning;

import java.util.Scanner;

/**
 * Created by Nastya on 28.09.2017.
 */
public class Lesson9Runner {

    public static void main(String[] args) {

     //Running method with running logic
    runLesson9Runner();
    }

    //Method with running logic
    public static void runLesson9Runner(){
        //Introduction of menu
        System.out.println("============================Menu===========================");
        System.out.println("1 - Checking by chatAt() method and counter ");
        System.out.println("2 - Checking by dividing string on 2 equals part and" +
                "\nchecking each symbol by charAt() method in each string");
        System.out.println("3 - Checking by dividing string on 2 equals part and" +
                "\ncomparing first part of string with second by matches() method");
        System.out.println("4 - Checking by dividing string on 2 equals part and\" +" +
                "\nchecking first part of string with second by endWith() method");
        System.out.println("5 - Checking by dividing string on 2 equals part and\" +" +
                "\ncomparing  first part of string with second strig Using StringBuffer");
        System.out.println("6 - Exit from program");
        System.out.println("Entering one of mentioned buttons causes launching corresponded " +
                "\nway of checking if String is Palindrome");

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
                "\nPress 6 to exit" +
                "\nPress 1 - 5 to reset running of corresponded class");
        exec(scanner2);
    }

    //Method that recieves scanner2 object and
    //causes reset of progrram if some character
    //have been input instead integers 1 - 5
    public static void resetAfterIncorrectData(Scanner scanner2){
        System.out.println("You have input 0 or invalid character/string" +
                "\nPress 6 to exit" +
                "\nPress 1 - 5 to reset running of corresponded class");
        //Method nextLine() is used to prevent Stack Overflow exception caused internal methods of  Scanner class
        scanner2.nextLine();
        exec(scanner2);
    }

    //Method that recieves a scanner2 object and executes all classes in current package
    char c;
    public static void exec( Scanner scanner2 ){
        if (scanner2.hasNextInt()) {
            int choice = scanner2.nextInt();
            if (choice > 0 && choice <= 6) {
                switch (choice) {
                    case 1:
                        Palindrome1OneRunning.runPalindrome1One();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 2:
                        Palindrome2TwoRunning.runPalindrome2Two();;
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 3:
                        Palindrome3ThreeRunning.runPalindrome3Three();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 4:
                        Palindrome4FourRunning.runPalindrome4Four();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 5:
                        Palindrome5FiveRunning.runPalindrome5Five();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 6:
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

