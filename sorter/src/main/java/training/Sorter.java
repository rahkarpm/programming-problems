package training;

public class Sorter {

    public static <T extends Comparable<T>> void doBubbleSort(T[] arrInput) {
        if (arrInput == null)
            return;

        int nArrLength = arrInput.length;

        if(nArrLength < 2)
            return;

        boolean bSwapsInPass = false;
        for(int nPassIdx= 0; nPassIdx < nArrLength; nPassIdx++){
            bSwapsInPass = false;
            for(int nElemIdx= 0; nElemIdx < nArrLength-nPassIdx-1; nElemIdx++){
                if((arrInput[nElemIdx].compareTo(arrInput[nElemIdx+1])) > 0){
                    swap(arrInput, nElemIdx, nElemIdx+1);
                    bSwapsInPass = true;
                }
            }
            if(!bSwapsInPass)
                break;
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

        if(nArrLength < 2)
            return;

        for (int nCurrIdx = 1; nCurrIdx < nArrLength; nCurrIdx++) {
            for(int nElemIdx = nCurrIdx ; nElemIdx > 0 ; nElemIdx--){
                if((arrInput[nElemIdx-1].compareTo(arrInput[nElemIdx])) > 0){
                    swap(arrInput, nElemIdx, nElemIdx-1);
                }else{
                    break;
                }
            }
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

    public enum SortOrder {
        ASC,
        DESC
    }
}
