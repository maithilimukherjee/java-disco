package prefix_sum;

import java.util.*;
public class P2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] prefix = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = sc.nextInt();

            if(i == 0)
            {
                prefix[i] = arr[i];
            }
            else
            {
                prefix[i] = prefix[i-1] + arr[i];
            }
        }

        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));
        sc.close();
    }

}
