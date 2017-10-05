package com.kitcenter.app.classwork.lesson9;

/**
 * Created by Nastya on 28.09.2017.
 */

//PLEASE REFACTOR
public class PalindromCompare {

    public void compare (String chars){
        int counter = 0;
        for (int i = 0; i < ( chars.length() / 2); i++) {
            if ((chars.charAt(i)) == chars.charAt((chars.length()-i)) ){
                counter++;
            }
        }
        if ((counter % 2) == 0 ){
            System.out.println("palindrom");
        } else{
            System.out.println("Not palindrom");
        }
    }
}
