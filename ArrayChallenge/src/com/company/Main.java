package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // create a program using arrays that will sort a list of integers in descending order
        // Descending is highest to lowest
        // In other words if the array has the values in it 106, 26, 81, 5, 15 your program
        // should ultimately have an array with 106, 81,26,15,5 in it
        // Set up the program so tha the numbers to sort are read from the keyboard
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int capacity) {
        int[] array= new int[capacity];
        System.out.println("enter " + capacity + " integer values: \r");
        for (int i =0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i =0; i < array.length; i++) {
            System.out.println("Elements " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length); //another way to copy an array

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0 ; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }



}
