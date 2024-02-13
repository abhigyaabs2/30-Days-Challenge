package Sorting;

import java.util.Arrays;

public class Count_sort {

    public static void CountSorting(int [] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] countArray;
        countArray = new int[max + 1];
        for (int num : arr) {
            countArray[num]++;
        }
        int index = 0;
        for (int i = 0; i < max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                i++;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,9,4,6,9};
        CountSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
