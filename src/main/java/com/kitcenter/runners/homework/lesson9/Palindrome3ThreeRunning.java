package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.PalindromeThree;
import com.kitcenter.app.homework.lesson9.PalindromeTwo;

/**
 * Created by Nastya on 07.10.2017.
 */
public class PalindromeThreeRunning {

    public static void main(String[] args) {

        PalindromeThree palindromeThree = new PalindromeThree();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindromeThree.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindromeThree.checkThirdCase(line));
    }
}
