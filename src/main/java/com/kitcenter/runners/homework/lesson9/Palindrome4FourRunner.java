package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome4Four;


/**
 * Created by Nastya on 07.10.2017.
 */
public class Palindrome4FourRunner {

    public static void main(String[] args) {
        runPalindrome4Four();

    }

    public static void runPalindrome4Four(){

        Palindrome4Four palindrome4Four = new Palindrome4Four();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindrome4Four.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindrome4Four.checkFourthCase(line));
    }
}
