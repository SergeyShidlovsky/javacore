package com.kitcenter.runners.classwork.lesson16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nastya on 24.10.2017.
 */
public class WordAddListRunner {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        String line;
        do {
            line = scan.nextLine();
            wordList.add(line);
        } while ( scan.nextLine().isEmpty());


        System.out.println(wordList.toString());
    }
}
