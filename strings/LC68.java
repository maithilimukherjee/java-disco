import java.util.ArrayList;
import java.util.List;

public class LC68
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> justifiedText = solution.fullJustify(words, maxWidth);
        
        for (String line : justifiedText) {
            System.out.println("\"" + line + "\"");
        }
    }
}

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            // Determine how many words fit on this line
            int lineLen = words[i].length();
            int j = i + 1;
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }
            
            // Words i..j-1 go on this line
            int numWords = j - i;
            int numSpaces = maxWidth - lineLen; // extra spaces to distribute (beyond the 1 already counted)
            // Actually recompute: total chars in words
            int totalChars = 0;
            for (int k = i; k < j; k++) totalChars += words[k].length();
            int totalSpaces = maxWidth - totalChars;
            
            StringBuilder sb = new StringBuilder();
            
            // Last line or single word: left-justified
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    if (k > i) sb.append(' ');
                    sb.append(words[k]);
                }
                while (sb.length() < maxWidth) sb.append(' ');
            } else {
                // Distribute spaces evenly
                int gaps = numWords - 1;
                int spacePerGap = totalSpaces / gaps;
                int extra = totalSpaces % gaps;
                
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spacePerGap + (k - i < extra ? 1 : 0);
                        for (int s = 0; s < spaces; s++) sb.append(' ');
                    }
                }
            }
            
            result.add(sb.toString());
            i = j;
        }
        
        return result;
    }
}

