package com.kitcenter.app.homework.lesson15;

/**
 * Created by Nastya on 28.10.2017.
 */
public enum Selebrities {
    CEZAR("Cezar",42, "dead"), CALLIGULA("Calligula", 32, "dead"), NEYRON("Neyron", 39, "dead" ),
    GANNIBAL("Gannibal", 62, "dead"), GENGHIS("Genghis", 43, "dead"), ALEXANDER("Alexander", 35, "dead"),
    ARISTO("Aristo",45, "dead"), FRANKLYN("Franklyn", 65, "dead"), ROUZVELT("Rouzvelt", 62, "dead"),
    CLINTON("Clinton", 67, "alive");

    //Each of enumerations will have next fields
    private String name;
    private int age;
    private String status;

    Selebrities(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    //Method that returns name of one of enumerations
    public String getName(){
        return name;
    }

    //Method that returns Age of one of enumerations
    public int getAge() {
        return age;
    }

    //Method that returns Status of one of enumerations
    public String getStatus() {
        return status;
    }
}
