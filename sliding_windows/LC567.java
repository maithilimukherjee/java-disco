package sliding_windows;

import java.util.*;

public class LC567 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = sol.checkInclusion(s1, s2);
        System.out.println(result); // Output: true
    }
    
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length())
        return false;


        int left = 0;
        int right = 0;
        boolean res = false;

        int[] s1count = new int[26];
        int[] s2count = new int[26];

         int k = s1.length();

        for(int i = 0; i<k; i++)
        {
            char current = s1.charAt(i);
            char current2 = s2.charAt(i);

            s1count[current-'a']++;
            s2count[current2-'a']++;

        }
        
        if(Arrays.equals(s1count,s2count))
        return true;

        for(right = k; right<s2.length(); right++)
        {
            char current = s2.charAt(right);

            s2count[current-'a']++;
            
            left = right-k;

            char outgoing = s2.charAt(left);

            s2count[outgoing-'a']--;

            if(Arrays.equals(s1count, s2count))
            return true;
        }


       
        return false;

        
    }
}
