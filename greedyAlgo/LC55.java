package greedyAlgo;

public class LC55 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,3,1,1,4};
        boolean result = sol.canJump(nums);
        System.out.println(result); // Output: true
    }
    
} 

class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(i>maxReach)
            return false;

            else
            {
                maxReach = Math.max(maxReach, i+nums[i]);

                if(maxReach>=nums.length-1)
                return true;
            }
        }

        return true;


        
    }
}