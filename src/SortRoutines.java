public class SortRoutines {
    // алгоритм сортировки выбором
    public static void selectoinSort(int[] mas) {
        int nMin;
        for (int start = 0; start < mas.length-1; start++) {
            // нахождение мин в части массива начиная со старт
            nMin = start;
            int min = mas[start];
            for (int i = start + 1; i < mas.length; i++) {
                if (mas[i] < min) {
                    min = mas[i];
                    nMin = i;
                }
                // change
                if (nMin != start)
                    ArrayRoutines.swapTwoElements(mas, nMin, start);
            }

        }
    }

    // Алгоритм сортировки пузырьком
    public static void bubbleSort(int[] mas) {
        for (int i = 0; i < mas.length-1; i++) {
            int end = mas.length - i;
            for (int j = 0; j < end-1; j++) {
                if (mas[j] > mas[j+1])
                    ArrayRoutines.swapTwoElements(mas, j, j+1);
            }
        }
    }
    //
    // Алгоритм сортировки пузырьком С ФЛАГОМ (при сортированном массиве с незначит изменениями)
    public static void bubbleSortF(int[] mas) {
        boolean flag = true;
        for (int i = 0; i < mas.length-1 && flag; i++) {
            int end = mas.length - i;
            flag = false;
            for (int j = 0; j < end-1; j++) {
                if (mas[j] > mas[j+1])
                    ArrayRoutines.swapTwoElements(mas, j, j+1);
                flag = true;
            }
        }
    }
}
