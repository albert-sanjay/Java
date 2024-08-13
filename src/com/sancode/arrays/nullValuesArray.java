package com.sancode.arrays;

import java.util.Arrays;

public class nullValuesArray {

    // Arrays null Values
    public static void result(){
        // Default value for primitive array is 0
        int[] numbers = new int[5];
        numbers[1] = 10;
        System.out.println(Arrays.toString(numbers));

        // Default value for reference type array is null
        String[] name = new String[3];
        name[0] = "Fiifi";
        System.out.println(Arrays.toString(name));
    }
}
