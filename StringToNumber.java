package com.company;

public class StringToNumber {

    //We need a function that can transform a string into a number.
    //Note: Don't worry, all inputs will be strings,
    // and every string is a perfectly valid representation of an integral number.

    public static int stringToNumber(String str) {

        int numberFromString = Integer.parseInt(str);

        return numberFromString;
    }
}
