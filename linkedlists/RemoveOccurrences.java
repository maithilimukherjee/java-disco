package linkedlists;
import java.util.*;

public class RemoveOccurrences
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        // input n
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // input elements
        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++)
        {
            int element = sc.nextInt();
            list.add(element);
        }

        // input element to remove
        System.out.println("Enter element to remove:");
        int target = sc.nextInt();

        // remove all occurrences of target
        for(int i = 0; i < list.size();)
        {
            if(list.get(i).equals(target))
            {
                list.remove(i);
            }
            else
            {
                i++;
            }
        }

        // print final list
        System.out.println(list);
    }
}