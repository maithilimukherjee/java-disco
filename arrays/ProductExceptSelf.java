
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Pass 1: The Left Ledger
        // answer[i] gets the product of everything strictly to the left of i
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i]; 
        }
        
        // Pass 2: The Right Ledger
        // Walk backwards, multiplying the running right product into the array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct; // Combine Left and Right
            rightProduct *= nums[i];   
        }
        
        return answer;
    }
}

public class ProductExceptSelf {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 24 12 8 6
    }
}