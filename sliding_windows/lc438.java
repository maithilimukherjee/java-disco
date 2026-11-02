package sliding_windows;

import java.util.*;


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        // Edge case trap
        if (s.length() < p.length()) return res;

        // Instead of HashMaps, use arrays mapped to the 26 alphabet letters
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        int k = p.length();

        // Build the target map and the FIRST window simultaneously
        for (int i = 0; i < k; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Check if the very first window is an anagram
        if (Arrays.equals(pCount, sCount)) {
            res.add(0);
        }

        for(int right = k; right<s.length(); right++)
        {
            sCount[s.charAt(right) - 'a']++;
            
            // Remove the old character falling out of the window on the left
            int left = right - k;
            sCount[s.charAt(left) - 'a']--;
            
            // Check if the current window matches
            if (Arrays.equals(pCount, sCount)) 
                res.add(left + 1); // The start of our current valid window
        }

        return res;
    }
}
