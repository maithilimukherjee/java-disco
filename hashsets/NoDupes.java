package hashsets;
import java.util.*;

public class NoDupes {

    public static void main(String[] args)
    {
        HashSet<Integer> set = new LinkedHashSet<>();
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("enter element: ");
            int element = sc.nextInt();
            set.add(element);
        }

        if(set.size() < n)
        {
            System.out.println("duplicate elements found");
        }
        else
        {
            System.out.println("no duplicate elements found");

            System.out.println("unique elements: " + set);
            for(int element : set)
            {
                System.out.print(element + " ");
            }
            return;
        }

        int cleanedArray[] = new int[set.size()];
        int index = 0;

        for(int element : set)
        {
            cleanedArray[index++] = element;
        }
        System.out.println("Array with no duplicates: ");
        for(int element : cleanedArray)
        {
            System.out.print(element + " ");
        }
    }
    
}
