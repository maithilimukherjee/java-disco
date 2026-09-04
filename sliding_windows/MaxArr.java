package sliding_windows;
import java.util.*;

public class MaxArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = 0;

        // Compute sum of the first window of size K
        for (int i = 0; i < K; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        // Slide the window from index K up to N - 1
        for (int i = K; i < N; i++) {
            currentSum = currentSum - arr[i - K] + arr[i];
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println(maxSum);
    }
}