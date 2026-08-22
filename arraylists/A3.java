package arraylists;
import java.util.*;

public class A3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        // input n

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // input elements
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            int element = sc.nextInt();
            a.add(element);
        }

        ArrayList<Integer> seen = new ArrayList<>();

        // remove duplicates while preserving order
        for(int element:a)
        {
            if(!seen.contains(element))
                seen.add(element);
        }


        // print final arraylist
        System.out.println(seen);

    }
}