package arraylists;
import java.util.*;

public class A4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        // input n
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            int element = sc.nextInt();
            a.add(element);
        }

        // remove duplicates
        ArrayList<Integer> seen = new ArrayList<>();

        for(int element : a)
        {
            if(!seen.contains(element))
                seen.add(element);
        }


        // sort the arraylist
        Collections.sort(seen);
        // find second largest distinct element
        int second = seen.get(seen.size()-2);
        // print result
        System.out.println(second);

    }
}