package daily.coding.problem;

import java.util.*;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        if (nums == null || nums.length < 2) {
            return sol;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        System.out.println("Indexes " + Arrays.toString(twoSum(nums, 17)));
        System.out.println("Indexes " + Arrays.toString(twoSum(nums, 13)));
    }
}
