package com.kitcenter.app.classwork.lesson11;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by Nastya on 05.10.2017.
 */
public class ReadFile {
        String firstLine = "The first line";
        String secondLine = "The second line";

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();


}
