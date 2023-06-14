package B;

import java.util.Arrays;

public class SearchAlgorithms {
    public static int[] bubbleSort(int[] arr) {
        int[] arrayToSort = arr;
        boolean swapped = true;
        int tmp;
        while (swapped == true) {

            swapped = false;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return arrayToSort;
    }


    public static void main(String[] args) {
        int[] array = {6,9,19,69,3,5,19,200};
        int[] sortedArray = SearchAlgorithms.bubbleSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}