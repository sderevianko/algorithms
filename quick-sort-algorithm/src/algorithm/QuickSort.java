package algorithm;

import java.util.List;
import java.util.ArrayList;

public class QuickSort {

    private List<Integer> array = new ArrayList<>();
    private int middle;

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

    public void setArrayAddToCollection(int i, int value) {
        array.add(i, value);
    }

    public int getArraySize() {
        return array.size();
    }

    public void quickSortAlgorithm (int low, int high) {

        int middle = low + (high - low) / 2;

        int pivot = array.get(middle);
        int indexI = low;
        int indexJ = high;

        while (indexI <= indexJ) {
            while (array.get(indexI) < pivot) {
                indexI++;
            }

            while (array.get(indexJ) > pivot) {
                indexJ--;
            }

            if (indexI <= indexJ) {
                int value = array.get(indexI);
                array.set(indexI, array.get(indexJ));
                array.set(indexJ, value);
                indexI++;
                indexJ--;
            }

            if (low < indexJ)
                quickSortAlgorithm(low, indexJ);

            if (high > indexI)
                quickSortAlgorithm(indexI, high);
        }
    }
}
