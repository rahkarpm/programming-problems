package training;

import java.util.Arrays;

public class Sorter {

    public static <T extends Comparable<T>> void doBubbleSort(T[] arrInput) {
        if (arrInput == null)
            return;

        int nArrLength = arrInput.length;

        if(nArrLength < 2)
            return;
        int nEachPassLimit = nArrLength -1;
        int nLastSwapIdx ;
        while(true){
            nLastSwapIdx = 0;
            for(int nElemIdx= 0; nElemIdx < nEachPassLimit; nElemIdx++){
                if((arrInput[nElemIdx].compareTo(arrInput[nElemIdx+1])) > 0){
                    swap(arrInput, nElemIdx, nElemIdx+1);
                    nLastSwapIdx = nElemIdx;
                }
            }
            if(nLastSwapIdx == 0)
                break;
            nEachPassLimit = nLastSwapIdx;
        }
    }

    public static <T extends Comparable<T>> void doSelectionSort(T[] arrInput) {
        if (arrInput == null)
            return;

        int nArrLength = arrInput.length;

        if(nArrLength < 2)
            return;

        int nSwapIdx = 0;
        for (int nCurrIdx = 0; nCurrIdx < nArrLength-1; nCurrIdx++)
        {
            nSwapIdx = nCurrIdx;
            for (int nElemIdx = nCurrIdx+1; nElemIdx < nArrLength; nElemIdx++){
                if((arrInput[nSwapIdx].compareTo(arrInput[nElemIdx])) > 0 ){
                    nSwapIdx = nElemIdx;
                }
            }
            swap(arrInput, nSwapIdx, nCurrIdx);
        }
    }

    public static <T extends Comparable<T>> void doInsertionSort(T[] arrInput) {
        if (arrInput == null)
            return;

        int nArrLength = arrInput.length;
        int nElemIdx;
        T nMinVal;

        if(nArrLength < 2)
            return;

        for (int nCurrIdx = 1; nCurrIdx < nArrLength; nCurrIdx++) {
            nMinVal = arrInput[nCurrIdx];
            for(nElemIdx = nCurrIdx ; nElemIdx > 0 ; nElemIdx--){
                if((arrInput[nElemIdx-1].compareTo(nMinVal)) <= 0)
                    break;
                arrInput[nElemIdx] = arrInput[nElemIdx - 1];
            }
            arrInput[nElemIdx] = nMinVal;
        }
    }

    public static <T extends Comparable<T>> void doQuickSort(T[] arrInput) {
        if (arrInput == null)
            return;

        int nArrLength = arrInput.length;

        if(nArrLength < 2)
            return;

        quickSort(arrInput,0, nArrLength -1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] arrInput, int nLow, int nHigh) {

        if(nLow >= nHigh)
            return;

        int nPivotIdx = partition(arrInput, nLow, nHigh);
        quickSort(arrInput, nLow, nPivotIdx-1);
        quickSort(arrInput, nPivotIdx+1, nHigh);

    }

    private static <T extends Comparable<T>> int partition(T[] arrInput, int nLow, int nHigh) {
        T pivot = arrInput[nHigh];
        int nPivotIdx = nHigh;

        while(true){
            while(nLow <= nHigh && (arrInput[nLow].compareTo(pivot) <= 0))
                nLow++;

            while(nHigh >= nLow && (arrInput[nHigh].compareTo(pivot) >= 0))
                nHigh--;

            if(nLow > nHigh)
                break;

            swap(arrInput, nLow, nHigh);
        }
        if(nLow < nPivotIdx){
            swap(arrInput, nLow, nPivotIdx);
            nPivotIdx = nLow;
        }
        return nPivotIdx;
    }

    private static <T extends Comparable<T>> void swap(T[] arrInput, int nElemIdx1, int nElemIdx2) {
        if(nElemIdx1 != nElemIdx2){
            T temp = arrInput[nElemIdx1];
            arrInput[nElemIdx1] = arrInput[nElemIdx2];
            arrInput[nElemIdx2] = temp;
        }
    }

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
