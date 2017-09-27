package com.kitcenter.app.homework.lesson7;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nastya on 26.09.2017.
 */

public class HomeTask7 {

    //Initializing array of integers
    ArrayList<Integer> list = new ArrayList<>();

    //We will keep length of object "list" in this variable
    int index_counter = 0;

    //Summ will be kept in this variable
    int summ;

    //Method will fill Array and count Summ of elements
    public void fillShowAndCount() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
            summ = summ + list.get(index_counter);
            index_counter++;
        }
        scan.close();
        System.out.println("Here is the array " + list.toString());
        System.out.println("Summ of all elements =  " + summ);
    }

}
