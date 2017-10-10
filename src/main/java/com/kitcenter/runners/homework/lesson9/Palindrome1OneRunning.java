package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.PalindromeOne;

/**
 * Created by Nastya on 07.10.2017.
 */
public class PalindromeOneRunning {

    public static void main(String[] args) {

        PalindromeOne palindromeOne = new PalindromeOne();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindromeOne.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindromeOne.checkFirstCase(line));
    }
}
