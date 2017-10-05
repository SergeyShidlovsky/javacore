package com.kitcenter.app.classwork.lesson9;

/**
 * Created by Nastya on 28.09.2017.
 */
public class PrimitivesToString {


    //Converting double to Srting
    public void doubleString( double dot){
        System.out.println("Initial value = " + dot );
        //Object based on String class
        String doubleValue  = new String();
        doubleValue = String.valueOf(dot);
        System.out.println("Returned String = " + doubleValue);
    }

    //Converting float to Srting
    public void floatString( float flo){
        System.out.println("Initial value = " + flo );
        //Object based on String class
        String floatValue  = new String();
        floatValue = String.valueOf(flo);
        System.out.println("Returned String = " + floatValue);
    }

    //Converting long to Srting
    public void longString( long lon){
        System.out.println("Initial value = " + lon );
        //Object based on String class
        String longValue  = new String();
        longValue = String.valueOf(lon);
        System.out.println("Returned String = " + longValue);
    }

    //Converting int to Srting
    public void intString( int in){
        System.out.println("Initial value = " + in );
        //Object based on String class
        String integerValue  = new String();
        integerValue = String.valueOf(in);
        System.out.println("Returned String = " + integerValue);
    }

    //Converting boolean to Srting
    public void booleanString( boolean boo){
        System.out.println("Initial value = " + boo );
        //Object based on String class
        String booleanValue  = new String();
        booleanValue = String.valueOf(boo);
        System.out.println("Returned String = " + booleanValue);
    }

    //Converting String to Primitives types
    public void stringToPrimitives(String str){
        float stringFloat = Float.valueOf(str);
        System.out.println(stringFloat);

        double stringDouble = Double.valueOf(str);
        System.out.println(stringDouble);

        long stringLong = Long.valueOf(str);
        System.out.println(stringLong);

        int stringInt = Integer.valueOf(str);
        System.out.println(stringInt);
    }

}
