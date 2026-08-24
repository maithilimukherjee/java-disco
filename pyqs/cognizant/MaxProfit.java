package pyqs.cognizant;
import java.util.Scanner;

public class MaxProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices, n);
        System.out.println(result);

        sc.close();
    }

    public static int maxProfit(int[] prices, int n) {

        int minSoFar = prices[0];
        int maxProfit = 0;

        for(int i = 1; i<n; i++)
        {
            if(prices[i]>minSoFar)
                maxProfit = Math.max(maxProfit,prices[i]-minSoFar);

            minSoFar = Math.min(minSoFar, prices[i]);
        }
        
        return maxProfit;
    }
}