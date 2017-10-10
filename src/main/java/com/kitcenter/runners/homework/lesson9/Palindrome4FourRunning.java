package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.PalindromeFour;


/**
 * Created by Nastya on 07.10.2017.
 */
public class PalindromeFourRunning {

    public static void main(String[] args) {

        PalindromeFour palindromeFour = new PalindromeFour();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindromeFour.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindromeFour.checkFourthCase(line));
    }
}
