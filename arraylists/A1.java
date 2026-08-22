package arraylists;
import java.util.*;

public class A1
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element: ");
            int element = sc.nextInt();
            a.add(element);
        }

        System.out.println(a);
    }
}