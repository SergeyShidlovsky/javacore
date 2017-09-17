package com.kitcenter.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by Nastya on 17.09.2017.
 */
public class Registration {
    String login;
    String password;
    public String[] logpass;

    public void scanning(){
    }

    public String[] setLogin(){
        System.out.print("Please insert login ");
        System.out.println("Use only numbers and letters");
        System.out.println("String must to have 4 and more symbols");
        Scanner scan = new Scanner(System.in);
        login = scan.nextLine();
        password = scan.nextLine();
        scan.close();
        logpass = new String[]{login, password};
        return logpass;
    }
/*
    public String setPassword(){
        System.out.print("Please insert Password ");
        System.out.println("Use only numbers and letters");
        System.out.println("String must to have 4 and more symbols");
        Scanner scan = new Scanner(System.in);
        password = scan.nextLine();
        scan.close();
        return password;
    }
*/

    public void validation(String value, String value2) {
        String message;
        String common = value + value2;
        System.out.println(common);

        char [] data = common.toCharArray();
        for (int i = 0; i <= (data.length - 1); i++) {
            System.out.println("Iteration " + i);
            if (data[i] == ' ' ) {
                message = "Space detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '"') {
                message = " \" detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '`') {
                message = " `  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '!') {
                message = " !  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '@') {
                message = " @  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '#') {
                message = " #  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '$') {
                message = " $  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '%') {
                message = " %  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '^') {
                message = " ^  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '*') {
                message = " *  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '(') {
                message = " (  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ')') {
                message = " )  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '-') {
                message = " -  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '_') {
                message = " _  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '=') {
                message = " =  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '+') {
                message = " +  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '/') {
                message = " /  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '.') {
                message = " .  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '?') {
                message = " ?  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '>') {
                message = " >  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ',') {
                message = " ,  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '<') {
                message = " <  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ';') {
                message = " ;  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ':') {
                message = " :  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '&') {
                message = " &  detected";
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '<') {
                message = " <  detected";
                System.out.println("Incorrect data " + message);
            } else {
                message = "Correct data";
                System.out.println(message);
            }
        }
    }
}

