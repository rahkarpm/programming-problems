package training;

public class Sorter {

    public static <T extends Comparable<T>> void doBubbleSort(T[] arrInput) {
        doBubbleSort(arrInput, SortOrder.ASC);
    }

    public static <T extends Comparable<T>> void doSelectionSort(T[] arrInput) {
        doSelectionSort(arrInput, SortOrder.ASC);
    }

    public static <T extends Comparable<T>> void doInsertionSort(T[] arrInput) {
        doInsertionSort(arrInput, SortOrder.ASC);
    }

    public static <T extends Comparable<T>> void doQuickSort(T[] arrInput) {
        doQuickSort(arrInput, SortOrder.ASC);
    }

    public static <T extends Comparable<T>> void doBubbleSort(T[] arrInput, SortOrder sortOrder) {
        sort(arrInput, sortOrder, SortAlgo.BUBBLE);
    }

    public static <T extends Comparable<T>> void doSelectionSort(T[] arrInput, SortOrder sortOrder) {
        sort(arrInput, sortOrder, SortAlgo.SELECTION);
    }

    public static <T extends Comparable<T>> void doInsertionSort(T[] arrInput, SortOrder sortOrder) {
        sort(arrInput, sortOrder, SortAlgo.INSERTION);
    }

    public static <T extends Comparable<T>> void doQuickSort(T[] arrInput, SortOrder sortOrder) {
        sort(arrInput, sortOrder, SortAlgo.QUICK);
    }

    private static <T extends Comparable<T>> void sort(T[] arrInput, SortOrder sortOrder, SortAlgo sortAlgo ){

        AbstractSort sorter = null;
        switch (sortAlgo) {
            case BUBBLE:
                sorter = new BubbleSort(sortOrder);
                break;
            case SELECTION:
                sorter = new SelectionSort(sortOrder);
                break;
            case INSERTION:
                sorter = new InsertionSort(sortOrder);
                break;
            case QUICK:
                sorter = new QuickSort(sortOrder);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sortAlgo);
        }
        sorter.sort(arrInput);
    }
}
