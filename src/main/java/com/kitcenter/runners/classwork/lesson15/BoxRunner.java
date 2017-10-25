package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Box;

/**
 * Created by Nastya on 24.10.2017.
 */
public class BoxRunner {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(21.0d);


       // T: java.lang.Integer
        //U: java.lang.Double
    }
}
