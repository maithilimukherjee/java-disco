package prefix_sum;

import java.util.*;

public class LongestZeroSum {

    public static void main(String[] args) {
        int arr[] = { 1, 2, -2, 4, -4 };
        Solution obj = new Solution();
        System.out.println(obj.maxLength(arr));
    }
    
}

class Solution {
    int maxLength(int arr[]) {
        // code here
        
        int len = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        
        map.put(0,-1);
        
        for(int i = 0; i<arr.length; i++)
        {
            sum+=arr[i];
            
            if(map.containsKey(sum))
            {
                len = Math.max(len,i-map.get(sum));
            }
            
            else
            map.put(sum,i);
        }
        
        return len;
        
    }
}