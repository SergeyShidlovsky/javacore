package com.kitcenter.app.classwork.lesson15;

/**
 * Created by Nastya on 24.10.2017.
 */
public class Box<T> {

    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
