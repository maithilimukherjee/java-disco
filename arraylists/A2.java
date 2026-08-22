package arraylists;
import java.util.*;

public class A2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++)
        {
            int element = sc.nextInt();
            a.add(element);
        }

        System.out.println("Original list: " + a);

        System.out.println("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.println("Enter index: ");
        int index = sc.nextInt();

        a.add(index, element);

        System.out.println("Updated list: " + a);
    }
}