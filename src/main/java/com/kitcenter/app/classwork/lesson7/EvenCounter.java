package com.kitcenter.app.classwork.lesson7;

/**
 * Created by Nastya on 21.09.2017.
 */
public class EvenCounter {

    public void counter(int a ,int b){
        int counter = 0;
        for (int i = a; i <= b; i++){
            if (i%2 == 0 && i !=0) {
                counter++;
            }
        }
        System.out.println("Counter for Even numbers = "  + counter);
    }
}
