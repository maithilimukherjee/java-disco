import java.util.Scanner;

public class MaxDiff {

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

        int result = maxDiff(arr, n);
        System.out.println(result);

        sc.close();
    }

    public static int maxDiff(int[] arr, int n) {
        
    if (n < 2) return -1;

    int minSoFar = arr[0];
    int maxDiff = -1;

    for (int i = 1; i < n; i++) {
        // If current element is greater than minimum seen so far, update maxDiff
        if (arr[i] > minSoFar) {
            maxDiff = Math.max(maxDiff, arr[i] - minSoFar);
        }
        
        // Update the minimum element seen so far
        minSoFar = Math.min(minSoFar, arr[i]);
    }

    return maxDiff;
}
}