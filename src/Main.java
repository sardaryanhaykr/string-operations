public class Main {
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
    static int partition(int intArray[], int low, int high) {
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
    public static void printArray(int[] array){
        System.out.print("(");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if (i < array.length-1){
                System.out.print(", ");
            }else{
                System.out.println(")");
            }
        }
    }
    public static void main(String[] args) {
      int[] array={0,18,26,7,13,8,11,34,17};
      printArray(array);
      //insertionSort(array);
        quickSort(array,0,array.length-1);
      printArray(array);
    }
}
