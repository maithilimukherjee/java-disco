package hashsets;
import java.util.*;

public class PairDifference {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the required difference: ");
        int k = sc.nextInt();

        // create HashSet
        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        // handle k = 0 and build set
        for(int element : arr)
        {
            if(k == 0 && set.contains(element))
            {
                found = true;
                break;
            }

            set.add(element);
        }

        // check for required difference
        if(!found)
        {
            for(int element : set)
            {
                if(set.contains(element + k))
                {
                    found = true;
                    break;
                }
            }
        }

        // output
        if(found)
        {
            System.out.println("pair with required difference exists");
        }
        else
        {
            System.out.println("no pair with required difference exists");
        }
    }
}