package training;

class SortUtil {
    static <T extends Comparable<T>> void swap(T[] arrInput, int nElemIdx1, int nElemIdx2) {
        if(nElemIdx1 != nElemIdx2){
            T temp = arrInput[nElemIdx1];
            arrInput[nElemIdx1] = arrInput[nElemIdx2];
            arrInput[nElemIdx2] = temp;
        }
    }

    static <T extends Comparable<T>> boolean isSwap(T prevItem, T nextItem, SortOrder sortOrder) {
        int nOrder = prevItem.compareTo(nextItem);
        return (sortOrder == SortOrder.ASC && nOrder > 0) || (sortOrder == SortOrder.DESC && nOrder < 0);
    }
}
