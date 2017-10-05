package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.Triangles;

/**
 * Created by Nastya on 02.10.2017.
 */
public class TrianglesRunning {
    public static void main(String[] args) {

        runTriangles();

    }

    public static void runTriangles(){

        Triangles tr = new Triangles();

        System.out.println("Please insert A length ");
        double a = tr.scanningLine();
        System.out.println("Please insert B length ");
        double b = tr.scanningLine();
        System.out.println("Please insert C length ");
        double c = tr.scanningLine();

        System.out.println("Egypt Triangle with mentioned lines " + tr.checkTriangle(a , b , c) );

    }
}
