package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.PalindromeFive;
import com.kitcenter.app.homework.lesson9.PalindromeFour;


/**
 * Created by Nastya on 07.10.2017.
 */
public class PalindromeFiveRunning {

    public static void main(String[] args) {

        PalindromeFive palindromeFive = new PalindromeFive();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindromeFive.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindromeFive.checkFifthCase(line));
    }
}
