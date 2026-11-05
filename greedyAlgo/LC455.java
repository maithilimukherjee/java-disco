package greedyAlgo;

import java.util.Arrays;

public class LC455 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] g = {1,2,3};
        int[] s = {1,1};
        int result = sol.findContentChildren(g, s);
        System.out.println(result); // Output: 1
    }
    
}

class Solution {
    public int findContentChildren(int[] g, int[] s) {


        Arrays.sort(g);
        Arrays.sort(s);
        
        int cookie=0;

        int i = 0;
        int j = 0;

        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                cookie++;
                i++;
                j++;
            }

            else
            {
                j++;
            }
        }

        return cookie;
        
    }
}