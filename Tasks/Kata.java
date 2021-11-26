package com.company;

public class Kata {
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
