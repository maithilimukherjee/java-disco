package hashmaps;

import java.util.*;
import java.io.*;

public class Frequency
{
    public static void main(String args[])
    {
        System.out.println("enter number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("enter number: ");
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        System.out.println("frequency of each element in the array is: ");
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}