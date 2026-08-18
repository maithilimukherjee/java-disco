package hashmaps;
import java.util.*;

public class Dupes {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element at index "+i+": ");
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int x: arr)
        {
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);

            else
                map.put(x,1);
        }

        System.out.println("The duplicate elements in the array are: ");
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }
    }
}
