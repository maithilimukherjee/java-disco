package neetcode.medium;

import java.util.*;

public class TopKFreq {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency of each number
        for (int x : nums) {

            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        // convert hashmap entries into a list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // sort by frequency: highest to lowest
        list.sort((a, b) ->
                Integer.compare(b.getValue(), a.getValue())
        );

        // store top k frequent elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }
}
