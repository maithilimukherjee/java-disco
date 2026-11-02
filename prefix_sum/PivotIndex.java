package prefix_sum;

public class PivotIndex {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = sol.pivotIndex(nums);
        System.out.println(result); // Output: 3
    }
    
}

class Solution {
    public int pivotIndex(int[] nums) {

        int left = 0;
        int right = 0;
        int total = 0;

        for(int x : nums)
        total+=x;

        for(int i=0; i<nums.length; i++)
        {
            right = total - left - nums[i];

            if(right==left)
            return i;

            else
            left+=nums[i];
        }

        return -1;
        
    }
}