package neetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        // count characters in s
        for (char x : s.toCharArray()) {

            if (!maps.containsKey(x)) {
                maps.put(x, 1);
            } else {
                maps.put(x, maps.get(x) + 1);
            }
        }

        // count characters in t
        for (char x : t.toCharArray()) {

            if (!mapt.containsKey(x)) {
                mapt.put(x, 1);
            } else {
                mapt.put(x, mapt.get(x) + 1);
            }
        }

        // compare frequencies
        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {

            char x = entry.getKey();

            if (!entry.getValue().equals(mapt.get(x))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter first string: ");
        String s = sc.nextLine();

        System.out.print("enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("are they anagrams? " + result);

        sc.close();
    }
}