package com.kitcenter.runners.homework.lesson13.computer;

import com.kitcenter.app.homework.lesson13.computer.Computer;
import com.kitcenter.app.homework.lesson13.computer.Dell;
import com.kitcenter.app.homework.lesson13.computer.Lenovo;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nastya on 18.10.2017.
 */
public class ComputerRuuner {

    public static void main(String[] args) {

        //Creating objects of computers
        Lenovo lenovo = new Lenovo();
        lenovo.setName("Lenovo");

        Dell dell = new Dell();
        dell.setName("Dell");

        //Creating an array of objects
        Computer computerArray [] = {lenovo, dell};

        //Initial settings of Computer
        System.out.println("Computers before CPU have been changed");
        printInfo(computerArray);

        //Changed settings of Computers
        System.out.println();
        changesForComouterArray(computerArray, setCPUConfig());
        System.out.println("Computers after CPU have been changed");
        printInfo(computerArray);
    }

    //Method that prints info about all computers
    public static void printInfo(Computer [] computerArray){

        //Changing CPU in Compute and Lenovo Objects one by one
        for (int i = 0; i <= (computerArray.length - 1); i++) {
            System.out.print("  -" + computerArray[i].getName() + " has " );
            System.out.println(computerArray[i].getCpu()  + " CPU  model");
        }
    }

    //Method that is changing CPU in Computer
    public static void changesForComouterArray(Computer [] computerArray, String[] setCPUConfig){

        //Changing CPU in Each PC to one another
        for (int i = 0; i <= computerArray.length - 1; i++) {
            computerArray[i].changeCPU(setCPUConfig[i]);
        }

    }

    //Method that allows user to chose new CPU for computer
    public static String [] setCPUConfig(){

        String arrCpu [] = new String [2];
        Scanner scanner =  new Scanner(System.in);
        int pointer;
        String cpu = "";
        for (int i = 0; i < 2; i++) {
            System.out.println("Please select new CPU for PC" +
                " | 1 - Intel Core i7"  +
                " | 2 - Intel Core i5" +
                " | 3 - Intel Core i3");
            pointer = scanner.nextInt();
            switch (pointer) {
                case 1 :
                    cpu = "Intel Core i7";
                    break;
                case 2 :
                    cpu = "Intel Core i5";
                    break;
                case 3 :
                    cpu = "Intel Core i3";
                    break;
                default :
                    cpu = "Unknown";
                    break;

            }
            arrCpu[i] = cpu;
        }
        return arrCpu;
    }


}
