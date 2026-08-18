package hashmaps;
import java.util.*;
public class TwoSum {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int target = 0;
        int difference = 0;

        System.out.println("Enter the target value: ");
        target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            difference = target - arr[i];

            if(map.containsKey(difference))
            {
                System.out.println("(" + map.get(difference) + ", " + i + ")");
                System.out.println("The two numbers are: " + arr[map.get(difference)] + " and " + arr[i]);
                return;
            }
            else
                map.put(arr[i], i);
        }

        System.out.println("no such pair exists");

    }
    
}
