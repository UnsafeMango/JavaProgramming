package com.company;

import java.util.Scanner;
public class SortedArray {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int n) {
        Scanner sc = new Scanner(System.in);
        int[] returnValue = new int[n];
        for (int i = 0; i < n; i++) {
            returnValue[i] = sc.nextInt();
            //sc.nextLine(); Fixed the Problem
        }
        return returnValue;
    }

    //Selection Sort
    public static int[] sortIntegers(int[] array) {

        int length = array.length;
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            int currentIndex = i;
            for (int j = i+1; j < length; j++) {
                int temp2 = array[j];
                if (temp < temp2) {
                    temp = temp2;
                    currentIndex = j;
                }
            }
            array[currentIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
