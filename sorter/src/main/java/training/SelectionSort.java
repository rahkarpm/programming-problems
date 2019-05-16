package training;

class SelectionSort extends AbstractSort{

    SelectionSort(SortOrder sortOrder) {
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

        int nSwapIdx = 0;
        for (int nCurrIdx = 0; nCurrIdx < nArrLength-1; nCurrIdx++)
        {
            nSwapIdx = nCurrIdx;
            for (int nElemIdx = nCurrIdx+1; nElemIdx < nArrLength; nElemIdx++){
                if(SortUtil.isSwap(arrInput[nSwapIdx], arrInput[nElemIdx], m_sortOrder)){
                    nSwapIdx = nElemIdx;
                }
            }
            SortUtil.swap(arrInput, nSwapIdx, nCurrIdx);
        }
    }
}
