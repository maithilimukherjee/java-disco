package pyqs.deloitte;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NearbyDuplicates {

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

        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(arr, n, k);
        System.out.println(result);

        sc.close();
    }

    public static boolean containsNearbyDuplicate(int[] arr, int n, int k) {
    Set<Integer> window = new HashSet<>();

    for (int i = 0; i < n; i++) {
        // Step 1: Check if element exists in the current window of size k
        if (window.contains(arr[i])) {
            return true;
        }

        // Step 2: Add current element to window
        window.add(arr[i]);

        // Step 3: Evict the element that falls outside the k-window
        if (window.size() > k) {
            window.remove(arr[i - k]);
        }
    }
    return false;
}
}