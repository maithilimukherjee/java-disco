package sliding_windows;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

public class minimalSubLen {
    
    public static void main(String args[]) {
        Solution solution = new Solution();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = solution.minSubArrayLen(target, nums);
        System.out.println(result); // Output: 2
    }
}
