package com.kitcenter.runners.classwork.lesson16;

import java.util.ArrayList;

/**
 * Created by Nastya on 24.10.2017.
 */
public class ArrayListRunner {
    public static void main(String[] args) {

        //ArrayList

        ArrayList<String>  myList  = new ArrayList<String>();

        String string1 = "abc";
        String string2 = "bcd";

        myList.add(string1);
        myList.add(string2);

        int theSize = myList.size();
        System.out.println("Size of Array" + theSize);

        System.out.println( "myList array = " + myList.toString());

        //Add the object parameter to list
        String string3 = "cde";
        myList.add(string3);

        //Remove some object from list
        myList.remove(string1);

        System.out.println( "new myList array = " + myList.toString());


    }
}


