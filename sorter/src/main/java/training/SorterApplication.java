package training;

import java.util.Arrays;

public class SorterApplication {
    public static void main(String[] args) {
        Test1();
        Test2();
    }

    private static void Test1() {
        Integer[] items1 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items1));
        Sorter.doInsertionSort(items1);
        System.out.println("After Insertion sort: " + Arrays.toString(items1));

        Integer[] items2 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items2));
        Sorter.doBubbleSort(items2);
        System.out.println("After Bubble sort: " + Arrays.toString(items2));

        Integer[] items3 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items3));
        Sorter.doSelectionSort(items3);
        System.out.println("After Selection sort: " + Arrays.toString(items3));

        Integer[] items4 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items4));
        Sorter.doQuickSort(items4);
        System.out.println("After Quick sort: " + Arrays.toString(items4));

        Integer[] items5 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items5));
        Sorter.doInsertionSort(items5, SortOrder.DESC);
        System.out.println("After Insertion sort: " + Arrays.toString(items5));

        Integer[] items6 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items6));
        Sorter.doBubbleSort(items6, SortOrder.DESC);
        System.out.println("After Bubble sort: " + Arrays.toString(items6));

        Integer[] items7 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items7));
        Sorter.doSelectionSort(items7, SortOrder.DESC);
        System.out.println("After Selection sort: " + Arrays.toString(items7));

        Integer[] items8 = {1, 5, 3, 2, 4};
        System.out.println("Before sort: " + Arrays.toString(items8));
        Sorter.doQuickSort(items8, SortOrder.DESC);
        System.out.println("After Quick sort: " + Arrays.toString(items8));
    }

    private static void Test2() {
        Integer[] items1 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items1));
        Sorter.doInsertionSort(items1);
        System.out.println("After Insertion sort: " + Arrays.toString(items1));

        Integer[] items2 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items2));
        Sorter.doBubbleSort(items2);
        System.out.println("After Bubble sort: " + Arrays.toString(items2));

        Integer[] items3 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items3));
        Sorter.doSelectionSort(items3);
        System.out.println("After Selection sort: " + Arrays.toString(items3));

        Integer[] items4 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items4));
        Sorter.doQuickSort(items4);
        System.out.println("After Quick sort: " + Arrays.toString(items4));

        Integer[] items5 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items5));
        Sorter.doInsertionSort(items5, SortOrder.DESC);
        System.out.println("After Insertion sort: " + Arrays.toString(items5));

        Integer[] items6 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items6));
        Sorter.doBubbleSort(items6, SortOrder.DESC);
        System.out.println("After Bubble sort: " + Arrays.toString(items6));

        Integer[] items7 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items7));
        Sorter.doSelectionSort(items7, SortOrder.DESC);
        System.out.println("After Selection sort: " + Arrays.toString(items7));

        Integer[] items8 = {0, 2, 1, 3, 4};;
        System.out.println("Before sort: " + Arrays.toString(items8));
        Sorter.doQuickSort(items8, SortOrder.DESC);
        System.out.println("After Quick sort: " + Arrays.toString(items8));
    }
}
