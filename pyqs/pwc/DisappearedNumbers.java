package pyqs.pwc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DisappearedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> result = findDisappearedNumbers(arr, n);
        System.out.println(result);

        sc.close();
    }

    public static List<Integer> findDisappearedNumbers(int[] arr, int n) {

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++)
            seen.add(arr[i]);

        for(int i=1; i<=n; i++)
        {
            if(!seen.contains(i))
                res.add(i);
        }

        return res;

    }
}
        
