package neetcode.medium;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}