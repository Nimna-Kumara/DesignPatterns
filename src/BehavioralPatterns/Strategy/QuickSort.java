package BehavioralPatterns.Strategy;

public class QuickSort implements SortingStrategy{

    @Override
    public void sort(int[] array) {
        System.out.println("Quick Sorting...");
    }
}
