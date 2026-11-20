package greedyAlgo;

public class LC1903
{
    public static void main(String[] args) {
        Solution s = new Solution();
        String num = "52";
        System.out.println(s.largestOddNumber(num));
    }
}

class Solution {
    public String largestOddNumber(String num) {

        int fromLast = 0;

        for(int i = num.length()-1; i>=0; i--)
        {
            if((num.charAt(i)-'0')%2!=0)
            {
                return num.substring(0,i+1);
            }

        }

        return "";

       
    }
}