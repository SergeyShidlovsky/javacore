package com.kitcenter.app.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nastya on 17.09.2017.
 */
public class Registration {
    String login;
    String password;
    public String[] logpass; //This array is needed to save Login and Passwords walue

    //This method allows user to set Login and Password
    public String[] setLoginPassword(){
        System.out.print("Please insert login ");
        System.out.println("Use only numbers, letters");
        Scanner scan = new Scanner(System.in);
        login = scan.nextLine();
        password = scan.nextLine();
        scan.close();
        logpass = new String[]{login, password}; //Array with inserted login and Password
        return logpass;
    }

    static String message;

    //This method performs validation of each symbol in strings "Login" and "Password"
    public static String validation(String value, String value2) {

        String common = value + value2;
        System.out.println(common);

        //This array contains all symbols of Login and PAssword strings
        char [] data = common.toCharArray();

        //This array is created to keep all
        char [] invalid_data = new char[data.length];
        //This is a counter of cases with invalid symdols
        int j = 0;
        for (int i = 0; i <= (data.length - 1); i++) {
            System.out.print("Symbol " + i + " - ");
            if (data[i] == ' ' ) {
                message = " Space detected";
                invalid_data[j] = ' ';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '\"') {
                message = " \" detected";
                invalid_data[j] = '"';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '\'') {
                message = " `  detected";
                invalid_data[j] = '\'';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '!') {
                message = " !  detected";
                invalid_data[j] = '!';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '@') {
                message = " @  detected";
                invalid_data[j] = '@';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '#') {
                message = " #  detected";
                invalid_data[j] = '#';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '$') {
                message = " $  detected";
                invalid_data[j] = '$';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '%') {
                message = " %  detected";
                invalid_data[j] = '%';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '^') {
                message = " ^  detected";
                invalid_data[j] = '^';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '*') {
                message = " *  detected";
                invalid_data[j] = '*';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '(') {
                message = " (  detected";
                invalid_data[j] = '(';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ')') {
                message = " )  detected";
                invalid_data[j] = ')';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '-') {
                message = " -  detected";
                invalid_data[j] = '-';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '_') {
                message = " _  detected";
                invalid_data[j] = '_';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '=') {
                message = " =  detected";
                invalid_data[j] = '=';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '+') {
                message = " +  detected";
                invalid_data[j] = '+';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '/') {
                message = " /  detected";
                invalid_data[j] = '/';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '.') {
                message = " .  detected";
                invalid_data[j] = '.';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '?') {
                message = " ?  detected";
                invalid_data[j] = '?';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '>') {
                message = " >  detected";
                invalid_data[j] = '>';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ',') {
                message = " ,  detected";
                invalid_data[j] = ',';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '<') {
                message = " <  detected";
                invalid_data[j] = '<';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ';') {
                message = " ;  detected";
                invalid_data[j] = ';';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ':') {
                message = " :  detected";
                invalid_data[j] = ':';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '&') {
                message = " &  detected";
                invalid_data[j] = '&';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '<') {
                message = " <  detected";
                invalid_data[j] = '<';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '{') {
                message = " &  detected";
                invalid_data[j] = '{';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '}') {
                message = " <  detected";
                invalid_data[j] = '}';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == '[') {
                message = " &  detected";
                invalid_data[j] = '[';
                j++;
                System.out.println("Incorrect data " + message);
            } else if (data[i] == ']') {
                message = " <  detected";
                invalid_data[j] = ']';
                j++;
                System.out.println("Incorrect data " + message);
            }  else if (data[i] == '|') {
                message = " &  detected";
                invalid_data[j] = '|';
                j++;
                System.out.println("Incorrect data " + message);
            }else {
                message = "Correct data";
                invalid_data[j] = 'C';
                j++;
                System.out.println(message);

            }
        }
        message = Arrays.toString(invalid_data);
        System.out.println(message);
        return message;
    }
}

