package com.kitcenter.app.classwork.lesson11;


import java.io.File;

/**
 * Created by Nastya on 05.10.2017.
 */
public class FilePath {

    // get current dir
    public void filePath() {
        String currentDir = System.getProperty("user.dir");

        String linuxStyle = "dir/somefile.txt";
        String windowsStyle = "dir\\somefile.txt";

        File file = new File(currentDir, linuxStyle);
        System.out.println(file.getAbsolutePath());

        file = new File(currentDir, windowsStyle);

        System.out.println(file.getAbsolutePath());
    }


}
