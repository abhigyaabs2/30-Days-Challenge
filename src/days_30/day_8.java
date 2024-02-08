package days_30;

import java.util.Arrays;

public class day_8 {
    public static void reversed(int[] nums, int start, int end) {
        int temp;

        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reversed(arr, 0,4);
        System.out.println(Arrays.toString(arr));
    }

}