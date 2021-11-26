package com.company;

public class Kata {

    //Write a method, that will get an integer array as parameter and will process every number from this array.
    //Return a new array with processing every number of the input-array
    //The input array will always contain only positive numbers and will never be empty or null.
    //The input array should not be modified!

    public static int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            int sqrt = (int) Math.sqrt(array[i]);

            if (array[i] == sqrt * sqrt) {
                newArray[i] = sqrt;
            } else {
                newArray[i] = array[i] * array[i];
            }
        }
        return newArray;
    }
}
