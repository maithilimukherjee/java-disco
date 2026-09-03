package neetcode.easy;

import java.util.*;

public class TwoSumMap {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        int[] result = new int[2];
        int a = 0;
        int difference = 0;

        // store number -> index
        for (int i = 0; i < nums.length; i++) {
            seen.put(nums[i], i);
        }

        // find the complement
        for (int i = 0; i < nums.length; i++) {

            a = nums[i];
            difference = target - a;

            if (seen.containsKey(difference) && i != seen.get(difference)) {

                result[0] = i;
                result[1] = seen.get(difference);

                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("indices: [" + result[0] + ", " + result[1] + "]");
    }
}