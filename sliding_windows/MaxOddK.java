package sliding_windows;

class Solution {
    public int maxOddinKSizeWindow(int[] nums, int k) {
        
        int countOdd = 0;
        int maxOdd = 0; // Can start at 0, since count can't be negative

        // 1. Build the initial window of size k
        for(int i = 0; i < k; i++) {
            if(nums[i] % 2 != 0) { // Handles negative odds!
                countOdd++;
            }
        }

        maxOdd = countOdd;

        // 2. Slide the window
        for(int right = k; right < nums.length; right++) {
            
            // Remove the outgoing element on the left
            int outgoingVal = nums[right - k];
            if(outgoingVal % 2 != 0) {
                countOdd--;
            }

            // Add the incoming element on the right
            int incomingVal = nums[right];
            if(incomingVal % 2 != 0) {
                countOdd++;
            }

            maxOdd = Math.max(maxOdd, countOdd);
        }

        return maxOdd;
    }
}

public class MaxOddK {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int result = sol.maxOddinKSizeWindow(nums, k);
        System.out.println(result); // Output: 2
    }
}