package prefix_sum;

import java.util.*;

public class ContiguousSubarray {
    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        Solution solution = new Solution();
        boolean result = solution.checkSubarraySum(nums, k);
        System.out.println(result); // Output: true
    }
}

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,-1);
        int prefix =0;
        int key = 0;

        for(int i=0; i<nums.length; i++)
        {
            prefix+=nums[i];

            key = prefix%k;

            if(map.containsKey(key))
            {
                if(i-map.get(key)>=2)
                return true;
            }

            else
            map.put(key,i);
        }

        return false;


        }
        
    }
