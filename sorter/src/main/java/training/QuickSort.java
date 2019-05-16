package training;

class QuickSort extends AbstractSort{

    QuickSort(SortOrder sortOrder) {
        super(sortOrder);
    }

    @Override
    <T extends Comparable<T>> void sort(T[] arrInput) {
        if (arrInput == null) {
            return;
        }

        int nArrLength = arrInput.length;

        if(nArrLength < 2){
            return;
        }

        if(m_sortOrder == null){
            m_sortOrder = SortOrder.ASC;
        }

        sort(arrInput,0, nArrLength -1);
    }

    private <T extends Comparable<T>> void sort(T[] arrInput, int nLow, int nHigh) {

        if(nLow >= nHigh){
            return;
        }
        int nPivotIdx = partition(arrInput, nLow, nHigh);
        sort(arrInput, nLow, nPivotIdx-1);
        sort(arrInput, nPivotIdx+1, nHigh);

    }

    private <T extends Comparable<T>> int partition(T[] arrInput, int nLow, int nHigh) {
        T pivot = arrInput[nHigh];
        int nPivotIdx = nHigh;

        while(true){
            while(nLow <= nHigh && !SortUtil.isSwap(arrInput[nLow], pivot, m_sortOrder)){
                nLow++;
            }
            while(nHigh >= nLow && !SortUtil.isSwap(pivot, arrInput[nHigh], m_sortOrder)){
                nHigh--;
            }
            if(nLow > nHigh){
                break;
            }
            SortUtil.swap(arrInput, nLow, nHigh);
        }
        if(nLow < nPivotIdx){
            SortUtil.swap(arrInput, nLow, nPivotIdx);
            nPivotIdx = nLow;
        }
        return nPivotIdx;
    }
}
