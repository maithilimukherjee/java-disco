package greedyAlgo;

public class LC860 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] bills = {5,5,5,10,20};
        boolean result = sol.lemonadeChange(bills);
        System.out.println(result); // Output: true
    }
    
}

class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fives = 0;
        int tens = 0;
        int twenties = 0;

        int change = 0;

        for(int i = 0; i<bills.length; i++)
        {
            if(bills[i]==5)
            fives++;

            else if(bills[i]==10)
            tens++;

            else
            twenties++;

            change = bills[i]-5;

            if(change==5)
            {
                if(fives==0)
                return false;

                else fives--;
            }

            if(change==10)
            {
                if(tens==0)
                {
                    if(fives>=2)
                    fives=fives-2;
                }

                else
                return false;

                tens=tens-1;
            }

            if(change==15)
            {
                if(tens>=1 && fives>=1)
                {
                    tens--;
                    fives--;
                }

                else if(fives>=3)
                {
                    fives=fives-3;
                }

                else
                return false;
            }


        }

        return true;

        
    }
}
