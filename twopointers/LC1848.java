package twopointers;

public class LC1848 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;
        System.out.println(s.getMinDistance(nums, target, start));
    }
    
}

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int left = start-1;
        int right = start;

        int minRes = nums.length+1;

        while(left>=0 || right<nums.length)
        {
            if(right<nums.length)
            {
                if(nums[right]==target)
                return right-start;
                right++;
            }
            
            if(left>=0)
            {
                if(nums[left]==target)
                return start-left;
                left--;
            }
        }

        return -1;
        
    }
}