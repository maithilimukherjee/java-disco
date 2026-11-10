package sliding_windows;

import java.util.HashMap;

public class LC3795 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 7;
        int result = sol.minLength(nums, k);
        System.out.println(result); // Output: 2
    }
    
}

class Solution {
    public int minLength(int[] nums, int k) {
        int minLen = Integer.MAX_VALUE;
        long distinctSum = 0; // Use long to prevent integer overflow
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            int rVal = nums[right];
            freq.put(rVal, freq.getOrDefault(rVal, 0) + 1);
            
            // Only add to distinctSum the FIRST time the element enters the window
            if (freq.get(rVal) == 1) {
                distinctSum += rVal;
            }
            
            // Shrink the window from the left as long as the condition holds
            while (distinctSum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                
                int lVal = nums[left];
                freq.put(lVal, freq.get(lVal) - 1);
                
                // Only subtract from distinctSum when ALL instances leave the window
                if (freq.get(lVal) == 0) {
                    distinctSum -= lVal;
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}

