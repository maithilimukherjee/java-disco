package sliding_windows;

import java.util.*;

public class LC3 {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;

        int maxLen = 0;

        for (right = 0; right < s.length(); right++) {

            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
            }

            else {
                while (set.contains(s.charAt(right)) && left < right) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(right));
            }

            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int ans = lengthOfLongestSubstring(s);

        System.out.println(ans);
    }
}