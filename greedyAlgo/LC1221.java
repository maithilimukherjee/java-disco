package greedyAlgo;

public class LC1221 {
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "RLRRLLRLRL";
        int result = sol.balancedStringSplit(s);
        System.out.println(result); // Output: 4
    }
}

class Solution {
    public int balancedStringSplit(String s) {

        int L = 0;
        int R = 0;

        int i = 0;

        int b = 0;

        while(i<s.length())
        {
            if(s.charAt(i)=='L')
            L++;

            else
            R++;

            if(L==R)
            {
                b++;
            }

            i++;
        }

        return b;


        
    }
}