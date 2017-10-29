package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.Selebrities;

import java.util.Scanner;

/**
 * Created by Nastya on 28.10.2017.
 */
public class SelebritiesRunner {

    public static void main(String[] args) {

        //Exporting all Selebrities objects to one array "selebrities[]"
        Selebrities selebrities[] = Selebrities.values();

    }

    //Method with main running logic
    public static void runSelebritiesRunner( Selebrities selebrities[] ){

        //Randomly selecting object Selebrity
        String selebrities[(int) (Math.random()*10)].getName();
    }

    //Method that is comparing user input data and info from "Selebrities" Enumeration
    public static void compareSelebrity(String age, String status){

    }

    //Method that is scanning data from PC
    public static String scanning(){
       Scanner scan = new Scanner(System.in);
       String data = scan.nextLine();
       return data;
    }
}
