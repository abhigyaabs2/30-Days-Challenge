package days_30;

import java.util.Arrays;

public class day_10 {
    public static void main(String[] args) {
        int [] bubble = {66,44,77,33,99};
        Bubble(bubble);
        System.out.println(Arrays.toString(bubble));
    }
    static void Bubble(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
