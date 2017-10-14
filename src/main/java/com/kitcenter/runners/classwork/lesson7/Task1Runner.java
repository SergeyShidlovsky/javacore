package com.kitcenter.runners.classwork.lesson7;

import com.kitcenter.app.classwork.lesson7.Task1;

import java.util.Scanner;

/**
 * Created by Nastya on 21.09.2017.
 */
public class Task1Runner {
    public static void main(String[] args) {

        Task1  t = new Task1();

        System.out.println("Please enter A");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Please enter B");
        int b = scan.nextInt();
        scan.close();

        t.compare(a, b);
    }
}
