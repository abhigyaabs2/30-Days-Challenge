package days_30;
import java.util.Arrays;
public class day_27 {

    static boolean valid(String str, int mid){
        int [] count = new int[200];
        boolean found = false;
        int add = 0;
        for(int i =0; i<str.length();i++){
            count[str.charAt(i)]++;
            if(count[str.charAt(i)]==1){
                add++;
            }
            if(i>=mid){
                count[str.charAt(i-mid)]--;
                if (count[str.charAt(i - mid)] == 0) {
                    add--;
                }
            }
            if (i >= mid - 1 && add == mid) {
                found = true;
            }
        }
        return found;
    }
    static int nonrep(String str){
        int length = str.length();
        int ans = Integer.MAX_VALUE;
        int start = 1, end = length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (valid(str, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "aibhophobia";
        int len = nonrep(str);
        System.out.println("The length of the longest non-repeating "
                + "character substring is " + len);
    }
}
