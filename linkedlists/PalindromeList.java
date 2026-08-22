package linkedlists;
import java.util.*;

public class PalindromeList
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

        // check whether list is palindrome
        boolean palindrome = true;

        LinkedList<Integer> reverse = new LinkedList<>();

        for(int i = list.size() - 1; i >= 0; i--)
        {
            reverse.add(list.get(i));
        }

        for(int i = 0; i < list.size(); i++)
        {
            if(!list.get(i).equals(reverse.get(i)))
            {
                palindrome = false;
                break;
            }
        }
        
        // print result
        System.out.println(palindrome);
    }
}