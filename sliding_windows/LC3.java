class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int len = 0;

        for(right=0; right<s.length(); right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            len = Math.max(right-left+1, len);
        }

        return len;
    }
}
