import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//-----------------------------------Test  homework1-----------------------------------

//      int[] array={0,18,26,7,13,8,11,34,17};
//        System.out.println("Array before sorting");
//        System.out.println(Arrays.toString(array));
//        System.out.println("Array after sorting");
//        //ArraySortUtil.insertionSort(array);
//        ArraySortUtil.quickSort(array,0,array.length-1);
//        System.out.println(Arrays.toString(array));

//-----------------------------------Test Task1 from homework2-----------------------------------
        String s1 = "hello";
        String s2 = "java";
        System.out.println(StringUtil.sumOfLength(s1, s2));
        StringUtil.printResult(s1, s2);
        System.out.println(StringUtil.concatAndUppercase(s1, s2));

//-----------------------------------Test Task2 from homework2-----------------------------------
        String st1 = "anagram";
        String st2 = "margana";
        StringUtil.printCaseInsensitiveAnnagram(st1,st2);
    }
}
