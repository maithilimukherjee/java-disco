package neetcode.medium;
import java.util.*;

public class LongestConSeq {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(nums));
    }

    
}

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : nums) {

            if (!set.contains(num - 1)) {

                int current = num;
                int len = 1;

                while (set.contains(current + 1)) {
                    current++;
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}
