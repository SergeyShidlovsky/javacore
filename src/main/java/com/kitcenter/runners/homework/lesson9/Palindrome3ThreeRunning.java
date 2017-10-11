package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome3Three;

/**
 * Created by Nastya on 07.10.2017.
 */
public class Palindrome3ThreeRunning {

    public static void main(String[] args) {

        runPalindrome3Three();

    }

    public static void runPalindrome3Three(){
        Palindrome3Three palindrome3Three = new Palindrome3Three();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindrome3Three.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindrome3Three.checkThirdCase(line));
    }
}
