package linkedlists;
import java.util.*;

public class A1
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

        // add element at beginning
        System.out.println("enter an element to add at the beginning: ");
        int firstElement = sc.nextInt();
        list.addFirst(firstElement);

        // add element at end
        System.out.println("enter an element to be added at the end: ");
        int lastElement = sc.nextInt();
        list.addLast(lastElement);

        // remove first element
        list.removeFirst();

        // remove last element
        list.removeLast();


        // print final list
        System.out.println(list);

    }
}