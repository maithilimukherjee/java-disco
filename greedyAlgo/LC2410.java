package greedyAlgo;

import java.util.Arrays;

public class LC2410 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};
        int result = sol.matchPlayersAndTrainers(players, trainers);
        System.out.println(result); // Output: 2
    }
    
}

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int match = 0;

        int i = 0; int j = 0;

        while(i<players.length && j<trainers.length)
        {
            if(players[i]<=trainers[j])
            {
                match++;
                i++;
                j++;
            }
            else
            j++;
        }

        return match;
        
    }
}


