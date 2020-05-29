package application;

import algorithm.QuickSort;

public class Main {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        quickSort.setArrayAddToCollection(0, 1);
        quickSort.setArrayAddToCollection(1, 5);
        quickSort.setArrayAddToCollection(2, 7);
        quickSort.setArrayAddToCollection(3, 2);
        quickSort.setArrayAddToCollection(4, 0);
        quickSort.setArrayAddToCollection(5, -3);
        quickSort.setArrayAddToCollection(6, 11);
        quickSort.setArrayAddToCollection(7, 8);
        quickSort.setArrayAddToCollection(8, 7);
        quickSort.setArrayAddToCollection(9, 4);

        System.out.println("Array before sort");
        System.out.print(quickSort.getArray());
        System.out.println(" ");
        quickSort.quickSortAlgorithm (0, quickSort.getArraySize() - 1);
        System.out.println("Array after quick sort");
        System.out.print(quickSort.getArray());
    }
}
