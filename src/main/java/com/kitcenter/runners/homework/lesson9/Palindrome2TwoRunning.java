package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.PalindromeTwo;

/**
 * Created by Nastya on 07.10.2017.
 */
public class PalindromeTwoRunning {

    public static void main(String[] args) {

        PalindromeTwo palindromeTwo = new PalindromeTwo();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindromeTwo.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindromeTwo.checkSecondCase(line));
    }
}
