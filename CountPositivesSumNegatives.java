package com.company;

public class CountPositivesSumNegatives {

    //Given an array of integers.
    //Return an array, where the first element is the count of positives numbers
    // and the second element is sum of negative numbers.
    //If the input array is empty or null, return an empty array.

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input.length == 0 || input == null) {

            int[] EmptyArray = {};

            return EmptyArray;
        }

        int countPositives = 0;
        int sumNegatives = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] > 0) {

                countPositives++;

            } else if (input[i] < 0) {

                sumNegatives += input[i];

            }

        }

        int[] returnValues = new int[]{countPositives, sumNegatives};
        return returnValues;
    }
}
