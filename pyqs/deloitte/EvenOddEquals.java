package pyqs.deloitte;
import java.util.*;

public class EvenOddEquals {

    public static int check(int arr[], int N)
    {
        for(int i=0; i<N; i++)
        {
            if(arr[i]%2==0)
            {
                arr[i] = 1;
            }
            else
            {
                arr[i] = -1;
            }
        }

        int countLen = 0;
        int sum = 0;

        for(int i=0; i<N; i++)
        {
            sum += arr[i];
            if(sum == 0)
            {
                countLen = i+1;
            }
        }

        if(countLen == 0)
        {
            return arr[0];
        }

        return countLen;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = check(arr, N);
        System.out.println(ans);

    }
    
}
