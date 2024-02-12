package days_30;

public class day_12 {
    public static int missingNumber(int [] arr, int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
       int ans = (n * (n+1))/2;
        if(ans > sum){
            return ans- sum;
        }
        return sum - ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        int n = arr.length;
        System.out.println(missingNumber(arr, n));
    }
}
