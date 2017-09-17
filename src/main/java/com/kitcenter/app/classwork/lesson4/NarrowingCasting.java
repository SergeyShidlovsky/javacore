package com.kitcenter.app.classwork.lesson4;

/**
 * Created by Nastya on 12.09.2017.
 */
public class NarrowingCasting {
    int int1;
    float float1;
    double double1;
    public NarrowingCasting(int a, float b){
        int1= a;
        float1 = b;
    }
    public NarrowingCasting(double a, float b){
        double1 = a;
        float1 = b;
    }

    public void narrowing(){
        int1 = (int) (float1);
        float1 =(float) double1;
        System.out.println(int1);
        System.out.println(float1);
    }
}
