package sliding_windows;
import java.util.*;

public class AtmostK
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();

            int arr[] = new int[N];

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();

            int left = 0;
            int right = 0;
            int maxLen = 0;

            for(right =0; right<N; right++)
                {
                    if(map.containsKey(arr[right]))
                        map.put(arr[right],map.get(arr[right])+1);

                    else
                        map.put(arr[right],1);

                    while(map.size()>K && left<=right)
                    {
                        map.put(arr[left],map.get(arr[left])-1);
                        if(map.get(arr[left])==0)
                        map.remove(arr[left]);
                        left++;
                    }

                    maxLen = Math.max(maxLen, right-left+1);
                }

            System.out.println(maxLen);

            

            
         }
    }