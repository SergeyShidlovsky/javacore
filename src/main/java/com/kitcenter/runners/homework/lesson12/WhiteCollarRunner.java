package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.WhiteCollar;

import java.util.Scanner;

/**
 * Created by Nastya on 12.10.2017.
 */
public class WhiteCollarRunner {
    public static void main(String[] args) {

        runWhiteCollarRunning();

    }

    //Method with main running logic
    public static void runWhiteCollarRunning(){

        //Describing person with name age and company in which person is working
        String name = "Sergey Ivanov";
        String company = "Mad Horns";
        int age  =  24;

        //Creating object person using mentioned above params
        WhiteCollar wc = new WhiteCollar(name, age, company);

        //Describing  who is person, how old is he/she and where person is working
        System.out.println( wc.getName() + " is " + wc.getAge() +
                " years old person and works in " +
                wc.getCompanyName() + " company");

        //Lets change company name
        System.out.println("Please enter new company name");
        Scanner scan = new Scanner(System.in);
        company = scan.nextLine();
        scan.close();

        //Let's check if company mane is Valid
        System.out.println(wc.setCompanyName(company));
        System.out.println("Company mane is " + wc.getCompanyName());

    }
}
