package prefix_sum;

import java.util.*;

class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        // Step 1: Build Row-wise Prefix Sums
        for (int r = 0; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                matrix[r][c] += matrix[r][c - 1];
            }
        }

        // Steps 2 & 3: Fix the Left Boundary (c1) and Right Boundary (c2)
        for (int c1 = 0; c1 < cols; c1++) {
            for (int c2 = c1; c2 < cols; c2++) {
                
                // Step 4: Initialize LC 560 State for this specific vertical slice
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int runningSum = 0;

                // Step 5: Sweep the Rows Vertically
                for (int r = 0; r < rows; r++) {
                    
                    // Step 6: Squash the Row 
                    int rowSum = matrix[r][c2];
                    if (c1 > 0) {
                        rowSum -= matrix[r][c1 - 1]; // Remove elements outside our left boundary
                    }
                    runningSum += rowSum;

                    // Step 7: Map Look-Back
                    if (map.containsKey(runningSum - target)) {
                        count += map.get(runningSum - target);
                    }
                    map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
                }
            }
        }
        return count;
    }
}

public class LC1074 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 1, 0}
        };
        int target = 0;
        int result = solution.numSubmatrixSumTarget(matrix, target);
        System.out.println("Number of submatrices that sum to target: " + result);
    }
}