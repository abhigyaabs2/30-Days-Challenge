package days_30;

import java.util.Arrays;
import java.util.Scanner;

public class day_11 {
    static void InsertionSort(int[] arr){
        for(int i= 0; i<arr.length-1; i++){
            for(int j= i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else
                    break;
            }
        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
    static int BinarySearch(int[] arr, int target){
        System.out.print("The number is at index: ");
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]) {
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {44,21,67,43,87};
        System.out.print("The sorted array is: ");
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to search: ");
        int target = sc.nextInt();
        System.out.println(BinarySearch(nums,target));
    }
}
