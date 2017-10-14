package com.kitcenter.runners.homework.lesson5;

import com.kitcenter.app.homework.lesson5.Registration;

/**
 * Created by Nastya on 17.09.2017.
 */
public class RegistrationRunner {
    public static void main(String[] args) {
        Registration reg = new Registration();

        //Here user gets array with login and Password  Strings
        reg.setLoginPassword();
        //Here login and Paswords strings are
        String login = reg.logpass[0];
        String password = reg.logpass[1];

        //Here login and password strings are given to validation class
        //to analyze each symbol
        reg.validation(login, password);

        System.out.println();

    }
}
