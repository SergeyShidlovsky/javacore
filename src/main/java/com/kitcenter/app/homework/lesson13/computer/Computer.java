package com.kitcenter.app.homework.lesson13.computer;

/**
 * Created by Nastya on 17.10.2017.
 */
public abstract class Computer {

    private String name;
    private String cpu = "Intel Pentium 4";

    public String changeCPU( String cpu){
        setCpu(cpu);
        return "CPU is changed " + cpu ;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
