import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toLowerCase();
        int L = sc.nextInt();

        Set<String> uniqueSubstrings = new HashSet<>();

        // Slide window of length L character-by-character
        for (int i = 0; i <= S.length() - L; i++) {
            String sub = S.substring(i, i + L);
            if (getDistinctVowelCount(sub) <= 2) {
                uniqueSubstrings.add(sub); // Automatically handles duplicate substrings
            }
        }

        System.out.println(uniqueSubstrings.size());
    }

    private static int getDistinctVowelCount(String str) {
        Set<Character> distinctVowels = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                distinctVowels.add(ch);
            }
        }
        return distinctVowels.size();
    }
}