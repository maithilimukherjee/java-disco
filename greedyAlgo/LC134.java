package greedyAlgo;

public class LC134 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int result = sol.canCompleteCircuit(gas, cost);
        System.out.println(result); // Output: 3
    }
    
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int tank = 0;
        int total = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++) {

            int balance = gas[i] - cost[i];

            tank += balance;
            total += balance;

            if(tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total < 0 ? -1 : start;
    }
}