package org.example;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int dataSize = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How large is the data size? ");
        dataSize = Integer.parseInt(scanner.nextLine());

        InsertionSort insertionSort = new InsertionSort();

        Random rand = new Random();
        int upperBound = 1001;
        int randNum = 0;
        int[] randData1 = new int[dataSize];
        for(int i = 0; i < dataSize; i++){
            randNum = rand.nextInt(upperBound);
            randData1[i] = randNum;
        }
        int[] randData2 = randData1.clone();

        int[] ascendingData1 = new int[dataSize];
        for(int i=0; i < dataSize; i++){
            ascendingData1[i] = i;
        }
        int[] ascendingData2 = ascendingData1.clone();

        int counter = dataSize - 1;
        int[] descendingData1 = new int[dataSize];
        for(int i = 0; i < dataSize; i++){
            descendingData1[i] = counter;
            counter--;
        }
        int[] descendingData2 = descendingData1.clone();

        long startInsertion = System.nanoTime();
        insertionSort.sort(randData1);
        long endInsertion = System.nanoTime();

        System.out.println("Random data insertion sort completed in: " + (endInsertion - startInsertion) + " nanoseconds");

        long startBuiltInSort = System.nanoTime();
        Arrays.sort(randData2);
        long endBuiltInSort = System.nanoTime();

        System.out.println("Random data built-in sort completed in: " + (endBuiltInSort - startBuiltInSort) + " nanoseconds");
        System.out.println();

        startInsertion = System.nanoTime();
        insertionSort.sort(ascendingData1);
        endInsertion = System.nanoTime();

        System.out.println("Ascending insertion sort completed in: " + (endInsertion - startInsertion) + " nanoseconds");

        startBuiltInSort = System.nanoTime();
        Arrays.sort(ascendingData2);
        endBuiltInSort = System.nanoTime();

        System.out.println("Ascending data built-in sort completed in: " + (endBuiltInSort - startBuiltInSort) + " nanoseconds");
        System.out.println();

        startInsertion = System.nanoTime();
        insertionSort.sort(descendingData1);
        endInsertion = System.nanoTime();

        System.out.println("Descending insertion sort completed in: " + (endInsertion - startInsertion) + " nanoseconds");

        startBuiltInSort = System.nanoTime();
        Arrays.sort(descendingData2);
        endBuiltInSort = System.nanoTime();

        System.out.println("Descending data built-in sort completed in: " + (endBuiltInSort - startBuiltInSort) + " nanoseconds");

        try {
            insertionSort.write(randData1, randData2,
                    ascendingData1, ascendingData2, descendingData1, descendingData2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}