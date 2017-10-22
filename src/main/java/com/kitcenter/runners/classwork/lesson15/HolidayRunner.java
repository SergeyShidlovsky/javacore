package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Holiday;

/**
 * Created by Nastya on 19.10.2017.
 */
public class HolidayRunner {

    public static void main(String[] args) {

        for (Holiday holiday: Holiday.values()) {
            System.out.println("=================================================");
            System.out.println( "= " + holiday.getHoliday()+ " is celebrated in " +
                holiday.getMonth() + " " + holiday.getNumber() + " =" );
        }
    }
}
