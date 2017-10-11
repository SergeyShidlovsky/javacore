package com.kitcenter.app.homework.lesson12;

/**
 * Created by Nastya on 11.10.2017.
 */
public class WhiteCollar extends Human {

    //Add new field to this class
    private String companyName;

    //Constructor that gets params same as Constructor of parent task + string name of company
    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    //Method that gets company name
    public String getCompanyName() {

        return companyName;
    }

    //Method that sets company name with data validation
    public String setCompanyName(String companyName) {

        //Check if string is Empty
        if (companyName.isEmpty()) {
            return "Company name " +  "\"" + companyName + "\"" + " is invalid";
        } else {
            //Enable counter for count quantity of valid symbols in string
            int counter = 0;
            //Counting quantity of valid symbols
            for (int i = 0; i <= (companyName.length() - 1); i++) {
                if (((companyName.charAt(i) >= 'a' &&  companyName.charAt(i) <= 'z') ||
                        (companyName.charAt(i) >= 'A' && companyName.charAt(i) <= 'Z')) ||
                        (companyName.charAt(i) == ' ' | companyName.charAt(i) == '-' |
                                companyName.charAt(i) == ',')) {
                    counter++;
                }
            }
            //Comparing quantity of valid symbols with all symbols in string
            if (counter == companyName.length()) {
                this.companyName = companyName;
                return "Company name " +  "\"" + companyName + "\"" + " is valid";
            } else {
                return "Company name " +  "\"" + companyName + "\"" + " is invalid";
            }
        }
    }
}
