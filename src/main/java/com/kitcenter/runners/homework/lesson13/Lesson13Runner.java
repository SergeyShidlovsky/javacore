package com.kitcenter.runners.homework.lesson13;

import com.kitcenter.runners.homework.lesson13.bicycle.BicycleRunner;
import com.kitcenter.runners.homework.lesson13.computer.ComputerRuuner;
import com.kitcenter.runners.homework.lesson13.flowers.BouquetRunner;
import com.kitcenter.runners.homework.lesson9.*;

import java.util.Scanner;

/**
 * Created by Nastya on 28.09.2017.
 */
public class Lesson13Runner {

    public static void main(String[] args) {

     //Running method with running logic
    runLesson13Runner();
    }

    //Method with running logic
    public static void runLesson13Runner(){
        //Introduction of menu
        System.out.println("============================Menu===========================");
        System.out.println("Press 1 - to launch BicycleRunner ");
        System.out.println("Press 2 - to launch Computer Runner");
        System.out.println("Press 3 - to launch Bouquet Runner");

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
                "\nPress 4 to exit" +
                "\nPress 1 - 3 to reset running of corresponded class");
        exec(scanner2);
    }

    //Method that recieves scanner2 object and
    //causes reset of progrram if some character
    //have been input instead integers 1 - 3
    public static void resetAfterIncorrectData(Scanner scanner2){
        System.out.println("You have input 0 or invalid character/string" +
                "\nPress 4 to exit" +
                "\nPress 1 - 3 to reset running of corresponded class");
        //Method nextLine() is used to prevent Stack Overflow exception caused internal methods of  Scanner class
        scanner2.nextLine();
        exec(scanner2);
    }

    //Method that recieves a scanner2 object and executes all classes in current package
    public static void exec( Scanner scanner2 ){
        if (scanner2.hasNextInt()) {
            int choice = scanner2.nextInt();
            if (choice > 0 && choice <= 4) {
                switch (choice) {
                    case 1:
                        BicycleRunner.runBicycleRunner();
                        //Resetting execution after completed previus class execution
                        resetExec(scanner2);
                        break;
                    case 2:
                        ComputerRuuner.runComputerRunner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 3:
                        BouquetRunner.runBouquetRunner();
                        //Resetting execution after completed previous class execution
                        resetExec(scanner2);
                        break;
                    case 4:
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

