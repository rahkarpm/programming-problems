package training;

class BubbleSort extends AbstractSort {

    BubbleSort(SortOrder sortOrder) {
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
        boolean bSwapsInPass = false;
        for(int nPassIdx= 0; nPassIdx < nArrLength; nPassIdx++){
            bSwapsInPass = false;
            for(int nElemIdx= 0; nElemIdx < nArrLength-nPassIdx-1; nElemIdx++){
                if(SortUtil.isSwap(arrInput[nElemIdx], arrInput[nElemIdx+1], m_sortOrder)){
                    SortUtil.swap(arrInput, nElemIdx, nElemIdx+1);
                    bSwapsInPass = true;
                }
            }
            if(!bSwapsInPass)
                break;
        }

    }
}
