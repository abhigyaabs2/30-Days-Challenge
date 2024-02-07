package days_30;

public class day_7 {
    public static void main(String[] args) {
        int [] arr = {2,4,6,4};
        int sum =0;
        int i =0;
        while (i<arr.length) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
