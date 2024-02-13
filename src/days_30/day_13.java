package days_30;

public class day_13 {
    static int MaxInt(int[] arr){
        int max = arr[0];
        for(int nums: arr){
            if(nums>max){
                max = nums;
            }
        }
        return max;
    }
    static int MinInt(int[] arr){
        int min = arr[0];
        for(int nums: arr){
            if(nums<min){
                min = nums;
            }
        }
        return min;
    }
    static int SumInt(int [] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum is: " + sum);
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int [] array = {19,55,34,1,78,23,2};
        System.out.println("The Maximum integer is: "+MaxInt(array));
        System.out.println("The Minimum integer is: "+MinInt(array));
        System.out.println("The average is: "+SumInt(array));

    }
}
