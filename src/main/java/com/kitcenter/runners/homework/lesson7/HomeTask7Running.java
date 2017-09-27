package com.kitcenter.runners.homework.lesson7;

import com.kitcenter.app.homework.lesson7.HomeTask7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nastya on 26.09.2017.
 */
public class HomeTask7Running {
    public static void main(String[] args) {

        HomeTask7 task7 = new HomeTask7();

        System.out.println("Please enter numbers for Array creation");
        System.out.println("If you want to stop number input");
        System.out.println("just enter 'exit' word");

        task7.fillShowAndCount();


    }
}
