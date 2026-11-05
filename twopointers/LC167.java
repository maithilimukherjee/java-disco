package twopointers;

public class LC167 {

    public static void main(String[] args) {
        
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Indices of the two numbers that add up to target: [" + result[0] + ", " + result[1] + "]");
    }
    
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] res = new int[2];

        int left = 0;
        int right = numbers.length-1;

        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }

            else if(numbers[left]+numbers[right]<target)
            left++;

            else
            right--;
        }

        return res;
        
    }
}
