package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson11.WriteFile;

import java.io.IOException;

/**
 * Created by Nastya on 05.10.2017.
 */
public class WriteFileRunning {

    public static void main(String[] args) {

        WriteFile wf = new WriteFile();


        try {
            wf.writeF();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
