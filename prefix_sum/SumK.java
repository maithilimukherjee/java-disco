package prefix_sum;
import java.util.HashMap;

public class SumK {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        SumK sumK = new SumK();
        System.out.println(sumK.subarraySum(nums, k));
    }


    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int current_prefix = 0;

        map.put(0, 1);

        for (int x : nums) {

            current_prefix += x;

            int target = current_prefix - k;

            if (map.containsKey(target)) {
                count += map.get(target);
            }

            map.put(
                current_prefix,
                map.getOrDefault(current_prefix, 0) + 1
            );
        }

        return count;
    }
}