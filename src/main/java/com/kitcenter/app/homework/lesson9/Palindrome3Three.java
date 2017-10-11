package com.kitcenter.app.homework.lesson9;

import java.util.Scanner;

/**
 * Created by Nastya on 05.10.2017.
 */
public class Palindrome3Three {

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

    //Method that describes THIRD way to consider that String is palindrome
    public String checkThirdCase(String line){

        line = lowercase(line);

        String firstPart;
        String secondPart;

        //Determine first string
        firstPart = line.substring(0,(line.length()  / 2));

        //Determine second string if it's string is even or odd
        if (line.length() % 2 == 0 && line.length() > 0 ){
            secondPart = line.substring(((line.length()  / 2)) , line.length());
        } else {
            secondPart = line.substring(((line.length()  / 2) + 1) , line.length());
        }

        //Revert chars in string
        String tempString = "";
        for (int i = 0; i <= (secondPart.length() - 1) ; i++) {
            tempString = tempString + secondPart.charAt((secondPart.length() - 1 - i));
        }
        secondPart = tempString;

        if (firstPart.matches(secondPart)){
            return "Palindrome";
        } else {
            return "Not palindrome";
        }

    }
}
