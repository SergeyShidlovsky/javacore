package com.kitcenter.runners.homework.lesson5;

import com.kitcenter.app.homework.lesson5.Registration;

/**
 * Created by Nastya on 17.09.2017.
 */
public class RegistrationRunning {
    public static void main(String[] args) {
        Registration reg = new Registration();

        reg.setLogin();
        String login = reg.logpass[0];
        String password = reg.logpass[1];

        reg.validation(login, password);
    }
}
