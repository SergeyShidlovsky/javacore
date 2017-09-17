package com.kitcenter.runners.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;

/**
 * Created by Nastya on 12.09.2017.
 */
public class NarrowingCastingRunning {
    public static void main(String[] args) {
        NarrowingCasting casting1  = new NarrowingCasting(0, 3.14159f);
        NarrowingCasting casting2  = new NarrowingCasting(3.14159f, 0);
        casting1.narrowing();
        casting2.narrowing();
    }
}
