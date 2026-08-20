package treemaps;

import java.util.*;

public class TicketPricing {

    /*
    SAMPLE INPUT:

    Enter number of tickets:
    5
    Enter ticket prices:
    10 20 20 30 40
    Enter number of customers:
    5
    Enter customer's maximum budget:
    25
    Enter customer's maximum budget:
    20
    Enter customer's maximum budget:
    20
    Enter customer's maximum budget:
    5
    Enter customer's maximum budget:
    40

    EXPECTED OUTPUT:

    20
    20
    10
    -1
    40
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of tickets:");
        int n = sc.nextInt();

        TreeMap<Integer, Integer> tickets = new TreeMap<>();

        System.out.println("Enter ticket prices:");
        for (int i = 0; i < n; i++) {

            int price = sc.nextInt();

            tickets.put(price, tickets.getOrDefault(price, 0) + 1);
        }

        System.out.println("Enter number of customers:");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.println("Enter customer's maximum budget:");
            int budget = sc.nextInt();

            // write your logic here

            Integer maxAffordablePrice = tickets.floorKey(budget);

            if (maxAffordablePrice != null) {
                System.out.println(maxAffordablePrice);
                tickets.put(maxAffordablePrice, tickets.get(maxAffordablePrice) - 1);
                if (tickets.get(maxAffordablePrice) == 0) {
                    tickets.remove(maxAffordablePrice);
                }
            } else {
                System.out.println(-1);
            }

        }

        sc.close();
    }
}