package prefix_sum;

import java.util.*;

public class NiceSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        int K = sc.nextInt();

        for(int i = 0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.numberOfSubarrays(arr,k));
    }
    
}

class Solution {
    public int numberOfSubarrays(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0,1);

        for(int x : arr)
        {
            sum+=(x%2);

            if(map.containsKey(sum-k))
            count = count + map.get(sum-k);

            map.put(sum,map.getOrDefault(sum,0)+1);


        }

        return count;
        
    }
}
