package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // FILL IN COMMENT
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
    }
    public static void write (int[] data1, int[] data2, int[] data3,
                              int[] data4, int[] data5, int[] data6) throws IOException {
        BufferedWriter writer = writer = new BufferedWriter(new FileWriter("sorted.out"));
        writer.write("Random data insertion output: ");
        for (int i = 0; i < data1.length; i++) {
            writer.write(data1[i]+" ");
            }
        writer.newLine();
        writer.write("Random data built-in sort output: ");
        for (int i = 0; i < data2.length; i++) {
            writer.write(data2[i]+" ");
            }
        writer.newLine();
        writer.write("Ascending data insertion sort output: ");
        for (int i = 0; i < data3.length; i++) {
            writer.write(data3[i]+" ");
            }
        writer.newLine();
        writer.write("Ascending data built-in sort output: ");
        for (int i = 0; i < data4.length; i++) {
            writer.write(data4[i]+" ");
            }
        writer.newLine();
        writer.write("Descending data insertion sort output: ");
        for (int i = 0; i < data5.length; i++) {
            writer.write(data5[i]+" ");
            }
        writer.newLine();
        writer.write("Descending data built-in sort output: ");
        for (int i = 0; i < data6.length; i++) {
            writer.write(data6[i]+" ");
            }
        writer.newLine();
        writer.flush();
        writer.close();
    }
}