package neetcode.easy;
import java.util.*;

class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> dupes = new HashSet<Integer>();

        for(int x : nums)
        {
            if(dupes.contains(x))
            return true;

            else
            dupes.add(x);
        }

        return false;
        
    }
}

public class Dupes {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nums = new int[N];

        for(int i=0; i<N; i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();

        boolean result = sol.hasDuplicate(nums);

        System.out.println(result);
    }
}