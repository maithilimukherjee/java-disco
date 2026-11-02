package sliding_windows;

public class LC1004 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,0,0,1,1,1,0,1};
        int k = 2;
        int result = sol.longestOnes(nums, k);
        System.out.println(result); // Output: 6
    }
    
}

class Solution {
    public int longestOnes(int[] nums, int k) {

        int countZeroes = 0;
        int left = 0;
        int right = 0;
        int len = 0;

        for(right=0; right<nums.length; right++)
        {
            if(nums[right]==0)
            countZeroes++;

            while(left<=right && countZeroes>k)
            {
                if(nums[left]==0)
                countZeroes--;

                left++;
            }

            len = Math.max(right-left+1,len);

        }

        return len;
        
    }
}
