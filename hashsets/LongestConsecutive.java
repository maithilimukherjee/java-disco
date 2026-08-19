package hashsets;
import java.util.*;

public class LongestConsecutive {

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

        // create HashSet
        HashSet<Integer> set = new HashSet<>();

        // add all elements to HashSet
        for(int element : arr)
        {
            set.add(element);
        }

        // solution
        int longest = 0;

        for(int element : set)
        {
            // element is the beginning of a sequence
            if(!set.contains(element - 1))
            {
                int current = element;
                int count = 1;

                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                if(count > longest)
                {
                    longest = count;
                }
            }
        }

        // output
        System.out.println("length of longest consecutive sequence: " + longest);
    }
}