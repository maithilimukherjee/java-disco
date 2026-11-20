package hashsets;

import java.util.HashSet;

public class LC532 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println(s.findPairs(nums, k));
    }
    
}

class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0) return 0;

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num + k)) {
                pairs.add(num);
            }
            if (seen.contains(num - k)) {
                pairs.add(num - k);
            }
            seen.add(num);
        }

        return pairs.size();
    }
}
