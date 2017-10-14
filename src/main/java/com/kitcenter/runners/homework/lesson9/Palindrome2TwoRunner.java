package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome2Two;

/**
 * Created by Nastya on 07.10.2017.
 */
public class Palindrome2TwoRunner {

    public static void main(String[] args) {

        runPalindrome2Two();
    }

    public static void runPalindrome2Two(){

        Palindrome2Two palindrome2Two = new Palindrome2Two();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindrome2Two.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindrome2Two.checkSecondCase(line));
    }
}
