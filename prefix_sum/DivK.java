package prefix_sum;

import java.util.*;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int prefix = 0;

        for (int num : nums) {
            prefix += num;
            
            // Normalize remainder to positive range [0, k-1]
            int key = ((prefix % k) + k) % k;

            if (map.containsKey(key)) {
                count += map.get(key);
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}

