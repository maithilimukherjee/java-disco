package prefix_sum;

import java.util.*;

public class ZeroSum {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = scanner.nextInt();
    }

    boolean hasZeroSumSubarray = zeroSum(nums);
    System.out.println(hasZeroSumSubarray ? "Yes" : "No");
    
}

public static boolean zeroSum(int[] nums) {
    int n = nums.length;
    int sum = 0;
    HashSet<Integer> set = new HashSet<>();
    set.add(0); // Add 0 to handle the case when the subarray starts from index 0

    for (int i = 0; i < n; i++) {
        sum += nums[i];

        if (set.contains(sum)) {
            return true; // Found a subarray with sum zero
        }

        set.add(sum);
    }

    return false; // No subarray with sum zero found
}
}