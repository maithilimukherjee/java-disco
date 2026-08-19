package hashsets;
import java.util.*;

public class CommonElements {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // input for first array
        System.out.println("enter size of first array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("enter elements of first array: ");
        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        // input for second array
        System.out.println("enter size of second array: ");
        int m = sc.nextInt();

        int arr2[] = new int[m];

        System.out.println("enter elements of second array: ");
        for(int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextInt();
        }

        // create HashSets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        // add elements of first array to set1
        for(int element : arr1)
        {
            set1.add(element);
        }

        // WRITE YOUR SOLUTION BELOW
        for(int element : arr2)
        {
            common.add(element);
        }

        common.retainAll(set1);

        // print result
        System.out.println("common elements: " + common);
    }
}