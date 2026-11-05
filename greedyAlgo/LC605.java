package greedyAlgo;

public class LC605 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean result = sol.canPlaceFlowers(flowerbed, n);
        System.out.println(result); // Output: true
    }
    
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int N = flowerbed.length;

        if (n == 0) return true;

        // 1. Single-element array edge case
        if (N == 1) {
            if (flowerbed[0] == 0) n--;
            return n <= 0;
        }

        // 2. Your Start Check (Index 0)
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        // 3. Your Middle Loop (Index 1 to N-2)
        for (int i = 1; i < N - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        // 4. Your End Check (Index N-1)
        if (flowerbed[N - 1] == 0 && flowerbed[N - 2] == 0) {
            flowerbed[N - 1] = 1;
            n--;
        }

        // 5. Final check (n <= 0 handles over-planting gracefully)
        return n <= 0;
    }
}
