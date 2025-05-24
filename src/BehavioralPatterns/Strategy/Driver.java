package BehavioralPatterns.Strategy;

public class Driver {

    public static void main(String[] args) {

        SortingContext sortingContext = new SortingContext(new BubbleSort());


        int[] array = {1,3,5,6,4,2};

        sortingContext.performSort(array);

        sortingContext.setSortingStrategy(new MergeSort());
        sortingContext.performSort(array);

        sortingContext.setSortingStrategy(new QuickSort());
        sortingContext.performSort(array);
    }
}
