package algorithm;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private List<Integer> array = new ArrayList<>();

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

    public void setArrayAddToCollection(int i, int value) {
        array.add(i, value);
    }

    public void bubbleSortAlgorithm () {
        int indexI;
        int value;
        int index = 1;
        while (index != (array.size() - 1)) {
            indexI = 0;
            while (indexI < (array.size() - index)) {
                if (array.get(indexI) > array.get(indexI + 1)) {
                    value = array.get(indexI);
                    array.set(indexI, array.get(indexI + 1));
                    array.set(indexI + 1, value);
                }
                indexI++;
            }
            index++;
        }
    };
}
