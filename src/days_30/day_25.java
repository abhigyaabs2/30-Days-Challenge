package days_30;

public class day_25 {
    public static int Sum(int [] arr, int n){
        if (n <= 0)
            return 0;
        return (Sum(arr, n - 1) + arr[n - 1]);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int result = Sum(arr, n);
        System.out.println(result);
    }
}