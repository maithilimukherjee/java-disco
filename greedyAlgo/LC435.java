package greedyAlgo;

import java.util.Arrays;

public class LC435 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int result = sol.eraseOverlapIntervals(intervals);
        System.out.println(result); // Output: 1
    }
    
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int count = 0;
        

        if (intervals.length == 0) return 0;
        
        // Sort strictly by END time to maximize remaining space
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int boundary = intervals[0][1];

        for(int i=1; i<intervals.length; i++)
        {
            if(intervals[i][0]<boundary)
            count++;

            else
            boundary = intervals[i][1];
        }

        return count;


        
    }
}