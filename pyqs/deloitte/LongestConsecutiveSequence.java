package pyqs.deloitte;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = longestConsecutive(arr, n);
        System.out.println(result);

        sc.close();
    }

    public static int longestConsecutive(int[] arr, int n) {
        if (n == 0) return 0;

        // O(1) lookup structure (vs O(log N) TreeSet)
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            seen.add(arr[i]);
        }

        int maxCount = 0;

        for (int num : seen) {
            // Check if 'num' is the START of a sequence.
            // If (num - 1) exists, 'num' is part of an existing sequence and will be counted later.
            if (!seen.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                // Expand forward only from the start
                while (seen.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                maxCount = Math.max(maxCount, currentCount);
            }
        }

        return maxCount;
    }
}