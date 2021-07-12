/**
 * Created by Hayk on 12.07.2021.
 */
public class ArraySortUtil {
 private ArraySortUtil(){}
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    private static int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low-1);
        for (int j=low; j<high; j++) {
            if (intArray[j] <= pi) {
                i++;
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
        int temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;

        return i+1;
    }
    public static void quickSort(int intArray[], int low, int high) {
        if (low < high) {
            int pi = partition(intArray, low, high);
            quickSort(intArray, low, pi-1);
            quickSort(intArray, pi+1, high);
        }
    }
}
