package sliding_windows;
import java.util.*;

public class sumK {

    public static int findWindowLength(int arr[], int N, int K)
    {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;

        for(right = 0; right < N; right++)
        {
            sum+=arr[right];

            while(sum > K)
            {
                sum-=arr[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = findWindowLength(arr, N, K);
        System.out.println(ans);
        
    }
    
}
