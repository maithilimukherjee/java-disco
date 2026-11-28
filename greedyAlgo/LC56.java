package greedyAlgo;
import java.util.*;

public class LC56 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = s.merge(intervals);
        for(int[] interval : res) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
    
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] active = intervals[0];
        merged.add(active);

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] <= active[1]) {
                active[1] = Math.max(active[1], curr[1]);
            } else {
                active = curr;
                merged.add(active);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
