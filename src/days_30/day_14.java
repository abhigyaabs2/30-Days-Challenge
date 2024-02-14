package days_30;

public class day_14 {
    static int Occurances(int[] array, int targ){
        int count =0;
        for(int nums : array){
            if(nums == targ){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5,2,3,4,2};
        int target = 2;
        System.out.println(Occurances(arr,target));
    }
    }