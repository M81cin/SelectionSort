package com.mcz;

import java.util.Arrays;

/**
 * Creates array and initializes with random numbers,
 * Then sorts the array using Selection Sort algorithm.
 */
public class SelectionSort {

    private int sizeOfArray;
    private int[] arr;

    /**
     * Accepts size of the array to create.
     * Creates array of the given size and fills with random numbers.
     */
    public SelectionSort(int sizeOfArray) {

        this.sizeOfArray = sizeOfArray;

        arr = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
    }

    /**
     * Executes Selection Sort on the array.
     */
    public void execute() {

        int noOfExecutions = 0;
        int indexOfMin;

        System.out.println("[" + noOfExecutions + "]" + this.toString());

        for(int i=0; i<sizeOfArray-1; i++) {
            indexOfMin = i;
            for(int j=i+1; j<sizeOfArray; j++) {
                if (arr[j] < arr[indexOfMin])
                    indexOfMin = j;
            }
            if (indexOfMin != i)
            swap(i, indexOfMin);

            noOfExecutions++;
            System.out.println("[" + noOfExecutions + "]" + this.toString());
        }
    }

    /**
     * Swaps number at given indexes
     */
    private void swap(int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Converts array to string
     */
    @Override
    public String toString() {
        return "SelectionSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
