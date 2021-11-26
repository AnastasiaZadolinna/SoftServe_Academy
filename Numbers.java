package com.company;

public class Numbers {

    //Each number should be formatted that it is rounded to two decimal places.
    // You don't need to check whether the input is a valid number
    // because only valid numbers are used in the tests.

    public static double TwoDecimalPlaces(double number)
    {

        return (double) Math.round(number * 100) / 100;

    }
}
