package training;

import java.util.Arrays;

public class SorterApplication {
    public static void main(String[] args) {
        Test1();
        Test2();
    }

    private static void Test1() {
        Integer[] items1 = {1, 5, 3, 2, 4};
        System.out.println("\nBefore sort: " + Arrays.toString(items1));
        Sorter.doInsertionSort(items1);
        System.out.println("After Insertion sort: " + Arrays.toString(items1));

        Integer[] items2 = {1, 5, 3, 2, 4};
        System.out.println("\nBefore sort: " + Arrays.toString(items2));
        Sorter.doBubbleSort(items2);
        System.out.println("After Bubble sort: " + Arrays.toString(items2));

        Integer[] items3 = {1, 5, 3, 2, 4};
        System.out.println("\nBefore sort: " + Arrays.toString(items3));
        Sorter.doSelectionSort(items3);
        System.out.println("After Selection sort: " + Arrays.toString(items3));

        Integer[] items4 = {1, 5, 3, 2, 4};
        System.out.println("\nBefore sort: " + Arrays.toString(items4));
        Sorter.doQuickSort(items4);
        System.out.println("After Quick sort: " + Arrays.toString(items4));

    }

    private static void Test2() {
        Integer[] items1 = {0, 2, 1, 3, 4};;
        System.out.println("\nBefore sort: " + Arrays.toString(items1));
        Sorter.doInsertionSort(items1);
        System.out.println("After Insertion sort: " + Arrays.toString(items1));

        Integer[] items2 = {0, 2, 1, 3, 4};;
        System.out.println("\nBefore sort: " + Arrays.toString(items2));
        Sorter.doBubbleSort(items2);
        System.out.println("After Bubble sort: " + Arrays.toString(items2));

        Integer[] items3 = {0, 2, 1, 3, 4};;
        System.out.println("\nBefore sort: " + Arrays.toString(items3));
        Sorter.doSelectionSort(items3);
        System.out.println("After Selection sort: " + Arrays.toString(items3));

        Integer[] items4 = {0, 2, 1, 3, 4};;
        System.out.println("\nBefore sort: " + Arrays.toString(items4));
        Sorter.doQuickSort(items4);
        System.out.println("After Quick sort: " + Arrays.toString(items4));

    }
}
