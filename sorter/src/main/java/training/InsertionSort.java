package training;

class InsertionSort extends AbstractSort{

    InsertionSort(SortOrder sortOrder) {
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

        T currValue = null;
        int nElemIdx = 0 ;
        for (int nCurrIdx = 1; nCurrIdx < nArrLength; nCurrIdx++) {
            for(nElemIdx = nCurrIdx ; nElemIdx > 0 ; nElemIdx--){
                if(SortUtil.isSwap(arrInput[nElemIdx-1], arrInput[nElemIdx], m_sortOrder)){
                    SortUtil.swap(arrInput, nElemIdx, nElemIdx-1);
                }else{
                    break;
                }
            }
        }

    }
}
