package com.kitcenter.runners.classwork.lesson9;

import com.kitcenter.app.classwork.lesson9.PalindromCompare;

/**
 * Created by Nastya on 28.09.2017.
 */
public class PalindromCompareRunning {
    public static void main(String[] args) {

        PalindromCompare compare = new PalindromCompare();

        String pol = "rgbaabgr";
        String notPol = "askfhdh";
        String pol2 = "rgbabgr";

        compare.compare(pol);
        compare.compare(notPol);
        compare.compare(pol2);
    }
}
