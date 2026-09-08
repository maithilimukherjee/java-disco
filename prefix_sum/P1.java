package prefix_sum;

import java.util.*;
public class P1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> prefix = new HashMap<>();

        int sum = 0;

        for(int i=0; i<N; i++)
        {
            sum = sum + arr[i];
            prefix.put(i, sum);
        }

        System.out.println("Prefix Sum Array: " + prefix);
    }
    
}
