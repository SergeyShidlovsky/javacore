package com.kitcenter.app.classwork.lesson15;

/**
 * Created by Nastya on 19.10.2017.
 */
public enum Holiday { NEW_YEAR(1, "January", "New Year"), IBDEPENDANCE_DAY(24, "August", "Independance day"),
    BIRSTDDAY(7,"July", "Birstday");
        private int number;
        private String month;
        private String holiday;

        private Holiday(int number, String month, String holiday){
            this.number = number;
            this.month = month;
            this.holiday = holiday;
        }

    public int getNumber() {
        return number;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getMonth() {
        return month;
    }
}
