package days_30;

public class day_15 {

    public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5};
            int k = 3;
            rotate(nums, k);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void rotate(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k == 0)
                return;

            int n = nums.length;
            k = k % n;

            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
        }

        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }


