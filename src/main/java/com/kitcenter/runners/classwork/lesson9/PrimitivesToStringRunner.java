package com.kitcenter.runners.classwork.lesson9;

import com.kitcenter.app.classwork.lesson9.PrimitivesToString;

/**
 * Created by Nastya on 28.09.2017.
 */
public class PrimitivesToStringRunner {
    public static void main(String[] args) {

        PrimitivesToString  pts = new PrimitivesToString();

        pts.booleanString(true);
        pts.doubleString(1000.44);
        pts.floatString(120.0090903F);
        pts.longString(120008L);
        pts.intString(34);

        pts.stringToPrimitives("6780");
     }
}
