package demoStack;

public class DemoStack {
    private int[] arrayStack = new int[10];
    private int[] arrayNewStack = new int[10];
    private int indexI = 0;
    private int indexJ = 0;
    private int popNumber;

    public void pushElement(int element) {
        arrayStack[indexI] = element;
        indexJ = indexI;
        indexI++;
    }

    public int popElement() {
        deleteAndShift();
        indexI--;
        return popNumber;
    }

    public void deleteAndShift() {
        popNumber = arrayStack[indexJ];
        for (int indexN = 0; indexN < indexJ; indexN++) {
            arrayNewStack[indexN] = arrayStack[indexN];
        }
        arrayStack = new int[10];
        for (int indexN = 0; indexN < indexJ; indexN++) {
            arrayStack[indexN] = arrayNewStack[indexN];
        }
        indexJ--;
    }

    public void checkArray() {
        for (int indexN = 0; indexN <= indexJ; indexN++) {
            System.out.print(" ");
            System.out.print(arrayStack[indexN]);
        }
        System.out.println(" ");
    }
}
