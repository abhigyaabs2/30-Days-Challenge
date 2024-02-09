package days_30;

import java.util.Scanner;

public class day_9 {

    static int LinearSearch(int[] arr, int target){
        System.out.print("The element is at index: ");
        if(arr.length==0){
            return -1;
        }
        for(int index =0; index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int [] arr = {59,47,77,84,68};
       System.out.print("Enter the number to be searched: ");
       Scanner sc = new Scanner(System.in);
       int target = sc.nextInt();
       int ans = LinearSearch(arr, target);
       System.out.println(ans);
    }
}
