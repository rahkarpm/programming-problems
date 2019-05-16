package training;

abstract class AbstractSort {
    SortOrder m_sortOrder;

    AbstractSort(SortOrder sortOrder){
        this.m_sortOrder = sortOrder;
    }

    abstract <T extends Comparable<T>> void sort(T[] arrInput);
}
