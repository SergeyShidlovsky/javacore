package com.kitcenter.app.utils.convertors;

/**
 * Created by Nastya on 14.09.2017.
 */
public class PrimitiveConvertor {

    int int1;
    float float1;
    char char1;

    public PrimitiveConvertor(int i, float f, char c){
        int1 = i;
        float1 = f;
        char1 = c;
    }

    public void floatToChar(float float1){
        int intVar = (int) float1;
        char charVar = (char)intVar;
        System.out.println("Input float value is " + float1 +
                " Output char value is " + charVar);

    }

    public void intToChar(int int1){
        int intVar = int1;
        char charVar = (char)intVar;
            if (charVar == 0) {
                String responce = "Space";
                System.out.println("Input int value is " + int1 +
                        " Output char value is " + responce);
            }else {
                System.out.println("Input int value is " + int1 +
                        " Output char value is " + charVar);
            }

        } ;


    public void charToInt(char char1){
        char charVar = char1;
        int intVar = charVar;
        System.out.println("Input char value is " + char1 +
                " Output int value is " + intVar);
    }

}
