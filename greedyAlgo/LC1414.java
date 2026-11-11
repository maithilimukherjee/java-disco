package greedyAlgo;

import java.util.ArrayList;

public class LC1414 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 7;
        int result = sol.findMinFibonacciNumbers(k);
        System.out.println(result); // Output: 2
    }
    
}

class Solution {
    public int findMinFibonacciNumbers(int k) {
        
        // 1. Print the money (Use ArrayList for easy backward access)
        ArrayList<Integer> fibs = new ArrayList<>();
        int a = 1;
        int b = 1;
        fibs.add(a);
        
        int term = a + b;
        a = b;
        b = term;
        
        while(term <= k) {
            fibs.add(term);
            term = a + b;
            a = b;
            b = term;
        }
        
        // 2. Be the Cashier (Walk backward and take bites out of k)
        int count = 0;
        
        for (int i = fibs.size() - 1; i >= 0; i--) {
            int currentCoin = fibs.get(i);
            
            if (currentCoin <= k) {
                k -= currentCoin;  // Hand over the bill
                count++;           // Count the bill
                
                if (k == 0) {      // We made exact change
                    break;
                }
            }
        }
        
        return count;
    }
}