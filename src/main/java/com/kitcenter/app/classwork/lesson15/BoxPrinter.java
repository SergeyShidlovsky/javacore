package com.kitcenter.runners.classwork.lesson15;

/**
 * Created by Nastya on 19.10.2017.
 */
public class BoxPrinter <T> {

    private T val ;
    //T stands for "Type" - this is placeholder

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String tpString(){
        return "{ " + val + " }";
    }

    public T getValue() {
        return val;
    }
}
