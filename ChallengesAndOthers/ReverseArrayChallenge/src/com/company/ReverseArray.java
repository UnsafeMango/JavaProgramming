package com.company;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse (int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int maxArray = array.length -1;

        int halfArray = array.length /2;

        for (int i=0; i<halfArray; i++){

            int temp = array[i];

            array[i]= array[maxArray-i];

            array[maxArray - i] = temp;

        }

        System.out.println("Reversed array = " + Arrays.toString(array));

    }

}
