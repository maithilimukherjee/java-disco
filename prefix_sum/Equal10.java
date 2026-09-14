package prefix_sum;

import java.util.*;

public class Equal10 {

    public int findMaxLength(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,-1);

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==0)
            arr[i] = -1;
        }

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i];

            if(map.containsKey(sum))
            maxLen = Math.max(i-map.get(sum),maxLen);

            else
            map.put(sum,i);
        }

        return maxLen;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++)
        {
        arr[i] = sc.nextInt();
        if(arr[i]!=0 && arr[i]!=1)
        {
            System.out.println("Invalid input. Please enter only 0s and 1s.");
            return;
        }

        Equal10 obj = new Equal10();
        System.out.println(obj.findMaxLength(arr));
    }
}
}

