package days_30;

import java.util.HashMap;
import java.util.Map;
public class day_26 {


        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = twoSum(nums, target);
            if (result != null) {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No solution found.");
            }
        }

        public static int[] twoSum(int[] nums, int target) {
            if (nums == null || nums.length < 2) {
                return null;
            }

            Map<Integer, Integer> numMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[]{numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }

            return null;
        }
    }

