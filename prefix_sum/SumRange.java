package prefix_sum;

import java.util.*;
public class SumRange {

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
        System.out.println("Sum from index 1 to 3: " + sumRange(prefix, 1, 3));
        System.out.println("Sum from index 0 to 2: " + sumRange(prefix, 0, 2));
        sc.close();
    }

    public static int sumRange(int[] prefix, int left, int right)
    {
        if(left==0)
        {
            return prefix[right];
        }
        else
        {
            return prefix[right] - prefix[left-1];
        }
    }

}
