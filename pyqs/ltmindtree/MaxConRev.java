package pyqs.ltmindtree;

import java.util.Scanner;

public class MaxConRev {

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

        int result = maxSubarraySum(arr, n);
        System.out.println(result);

        sc.close();
    }

    public static int maxSubarraySum(int[] arr, int n) {
        
        int maxSum = arr[0];
        int currentSum = maxSum;

        for(int i = 0; i<n; i++)
        {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum, currentSum);
            
        }

        return maxSum;
    }
}