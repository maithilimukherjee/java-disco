package greedyAlgo;

public class LC45 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,3,1,1,4};
        int result = sol.jump(nums);
        System.out.println(result); // Output: 2
    }
    
}

class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int current_window_end = 0;
        int farthest = 0;

        // We loop until the SECOND TO LAST element. 
        // If we are already at the last index, we don't need another jump!
        for (int i = 0; i < nums.length - 1; i++) {
            
            // 1. Continuously find how far we can possibly reach
            farthest = Math.max(farthest, i + nums[i]);

            // 2. If we reach the end of our current jump's coverage...
            if (i == current_window_end) {
                jumps++; // We MUST consume a jump to keep moving
                current_window_end = farthest; // Our new coverage extends to the farthest point we found
            }
        }

        return jumps;
    }
}