public class MoveZeroes {
 
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        System.out.print("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0; // Tracks the position for the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the non-zero element with the element at position 'z'
                int temp = nums[i];
                nums[i] = nums[z];
                nums[z] = temp;
                
                z++; // Move the zero boundary forward
            }
        }
    }
}

//Explanation:
// The moveZeroes method iterates through the input array nums. It uses a pointer z
// to track the position where the next non-zero element should be placed. When a non-zero
// element is found, it is swapped with the element at position z, and z is increment

//Time Complexity: O(n), where n is the length of the input array nums. The algorithm makes a single pass through the array, performing constant-time operations for each element.