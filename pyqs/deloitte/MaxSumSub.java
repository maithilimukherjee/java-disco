package pyqs.deloitte;

import java.util.*;

public class MaxSumSub {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;

        for (int i = 0; i < N; i++) {
            // 1. Add current element to window
            currentSum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // 2. Shrink window from left if size exceeds K
            if (i >= K) {
                int out = arr[i - K];
                currentSum -= out;
                map.put(out, map.get(out) - 1);
                if (map.get(out) == 0) {
                    map.remove(out);
                }
            }

            // 3. When window size equals K, check if all elements are distinct
            if (i >= K - 1 && map.size() == K) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
    }
}