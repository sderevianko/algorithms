package application;


import algorithm.BubbleSort;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.setArrayAddToCollection(0, 17);
        bubbleSort.setArrayAddToCollection(1, 9);
        bubbleSort.setArrayAddToCollection(2, 3);
        bubbleSort.setArrayAddToCollection(3, 7);
        bubbleSort.setArrayAddToCollection(4, 0);
        bubbleSort.setArrayAddToCollection(5, -5);
        bubbleSort.setArrayAddToCollection(6, -11);
        bubbleSort.setArrayAddToCollection(7, 4);
        bubbleSort.setArrayAddToCollection(8, 17);
        bubbleSort.setArrayAddToCollection(9, 8);

        System.out.println("Array before sort");
        System.out.print(bubbleSort.getArray());
        System.out.println(" ");
        bubbleSort.bubbleSortAlgorithm();
        System.out.println("Array after bubble sort");
        System.out.print(bubbleSort.getArray());
    }
}
