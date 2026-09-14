package prefix_sum;

import java.util.*;

public class EqualEvenOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Solution solution = new Solution();
        int maxLength = solution.maxLenEqualEvenOdd(arr);
        System.out.println(maxLength); // Output: 6
    }
    
}

class Solution {
    public int maxLenEqualEvenOdd(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base state: sum 0 at virtual index -1
        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            // Even -> +1, Odd -> -1 (handles negative numbers correctly)
            sum += (arr[i] % 2 == 0) ? 1 : -1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i); // Greedy retention: keep earliest index
            }
        }

        return maxLen;
    }
}
