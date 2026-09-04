package sliding_windows;

import java.util.*;

public class MinArr {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int i=0;

        int[] arr = new int[N];
        for (i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = 0;

        int minSum = Integer.MAX_VALUE;

        for(i=0; i<K; i++)
        {
            currentSum += arr[i];
        }

        minSum = currentSum;

        i=K;

        while(i<N)
        {
            currentSum = currentSum - arr[i-K] + arr[i];
            minSum = Math.min(currentSum, minSum);
            i++;
        }
        System.out.println(minSum);
    }
    
}
