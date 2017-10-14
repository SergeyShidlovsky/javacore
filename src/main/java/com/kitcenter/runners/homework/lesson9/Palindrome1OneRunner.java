package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome1One;

/**
 * Created by Nastya on 07.10.2017.
 */
public class Palindrome1OneRunning {

    public static void main(String[] args) {

        runPalindrome1One();
    }

    public static void runPalindrome1One(){

        Palindrome1One palindrome1One = new Palindrome1One();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindrome1One.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindrome1One.checkFirstCase(line));

    }
}
