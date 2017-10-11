package com.kitcenter.app.homework.lesson9;

import java.util.Scanner;

/**
 * Created by Nastya on 05.10.2017.
 */
public class Palindrome2Two {

    //Mrthod that performs scanning and returns line
    public String scanning(){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        return line;
    }

    //Method that refactors Sting to lowercase
    public String lowercase(String line){
        line = line.toLowerCase();
        return line;
    }

    //Method that describes SECOND way to consider that String is palindrome
    //String will be cut by half of string's length and 2 strings will be get
    //If these 2 string will be compared to each other then string is Palindrome
    public String checkSecondCase(String line){

        line = lowercase(line);

        String firstPart = "";
        String secondPart = "";
        for (int i = 0; i <= ((line.length() - 1 ) / 2); i++) {
            firstPart = firstPart + line.charAt(i);
            secondPart = secondPart + line.charAt(line.length() - 1 - i);
        }
        if (firstPart.matches(secondPart)){
            return "Palindrome";
        } else {
            return "Not palindrome";
        }

    }
}
