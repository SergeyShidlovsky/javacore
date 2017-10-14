package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.Palindrome5Five;


/**
 * Created by Nastya on 07.10.2017.
 */
public class Palindrome5FiveRunner {

    public static void main(String[] args) {


    }

    public static void runPalindrome5Five(){

        Palindrome5Five palindrome5Five = new Palindrome5Five();

        //Scanning line from console
        System.out.println("Please enter some text");
        String line = palindrome5Five.scanning();

        //Check if line is palindrome
        System.out.println( "String is "+ palindrome5Five.checkFifthCase(line));
    }

}
