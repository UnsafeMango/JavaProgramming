package com.company;

import java.util.Scanner;
public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int length) {
        int[] elements = new int[length];

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<length; i++)
            elements[i] = scanner.nextInt();

        return elements;
    }

    private static int findMin(int[] elements) {
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if(elements[i] < minimum)
                minimum = elements[i];
        }

        return minimum;
    }
}
