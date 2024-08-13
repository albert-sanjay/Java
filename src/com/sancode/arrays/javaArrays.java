package com.sancode.arrays;

import java.util.Arrays;

public class javaArrays {

    // An array is used to store multiple values of the same data type in one variable
    public static void arrayResult() {
        // Intializing an Array
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 9;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        // Another way to initailize an array
        String[] names = {"Albert", "Fred"};

    }
}
