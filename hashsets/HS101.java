package hashsets;
import java.util.*;

public class HS101 {

    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

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

        System.out.println("HashSet elements: " + set);

        System.out.println("number of unique elements: " + set.size());

        int searchElement = 0;
        System.out.println("enter element to search: ");
        searchElement = sc.nextInt();

        if(set.contains(searchElement))
        {
            System.out.println("element found in HashSet");
        }
        else
        {
            System.out.println("element not found in HashSet");
        }

        int removeElement = 0;
        System.out.println("enter element to remove: ");
        removeElement = sc.nextInt();

        if(set.remove(removeElement))
        {
            System.out.println("element removed from HashSet");
        }
        else
        {
            System.out.println("element not found in HashSet");
        }

        System.out.println("updated set: " + set);

        System.out.println("enter number of elements for the second set: ");
        int m = sc.nextInt();

        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i < m; i++)
        {
            System.out.println("enter element: ");
            int element = sc.nextInt();
            set2.add(element);
        }

        System.out.println("HashSet 2 elements: " + set2);

        HashSet<Integer> unionSet = new HashSet<>();

        unionSet.addAll(set);
        unionSet.addAll(set2);

        System.out.println("Union of both sets: " + unionSet);

        System.out.println("common elements in both sets: ");

        HashSet<Integer> intersectionSet = new HashSet<>(set);
        intersectionSet.retainAll(set2);

        System.out.println(intersectionSet);

        HashSet<Integer> differenceSet = new HashSet<>(set);
        differenceSet.removeAll(set2);
        System.out.println("Elements in first set but not in second set: " + differenceSet);

        System.out.println("final sizes of each set: ");
        System.out.println("size of first set: " + set.size());
        System.out.println("size of second set: " + set2.size());
        System.out.println("size of union set: " + unionSet.size());
        System.out.println("size of intersection set: " + intersectionSet.size());

    }
    
}
