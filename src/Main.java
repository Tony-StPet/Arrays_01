public class Main {
    public static void main(String[] args) {
        int[] m = ArrayRoutines.inputArray(6);
        ArrayRoutines.printArray(m);
        // selectoinSort(m);
        //bubbleSort(m);
        SortRoutines.bubbleSortF(m);
        ArrayRoutines.printArray(m);
    }


}
