package hashsets;
import java.util.*;

public class HappyNumber {

    public static int sumOfSquares(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        HashSet<Integer> seen = new HashSet<>();

        int current = n;

        while(current != 1 && !seen.contains(current))
        {
            seen.add(current);
            current = sumOfSquares(current);
        }

        if(current == 1)
        {
            System.out.println(n + " is a happy number");
        }
        else
        {
            System.out.println(n + " is not a happy number");
        }
    }
}
