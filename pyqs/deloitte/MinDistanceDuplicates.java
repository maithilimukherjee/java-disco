package pyqs.deloitte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinDistanceDuplicates {

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

        int result = minDistance(arr, n);
        System.out.println(result);

        sc.close();
    }

    public static int minDistance(int[] arr, int n) {

        // TODO: Track the most recent index of each element and update min distance
        int minDiff=Integer.MAX_VALUE;
        int flag = 0;

        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            if(!seen.containsKey(arr[i]))
                seen.put(arr[i], i);

            else
            {
                flag=1;
                minDiff = Math.min(minDiff, Math.abs(seen.get(arr[i])-i));
                seen.put(arr[i],i);
            }
        }

        return flag==1?minDiff:-1;
    }
}