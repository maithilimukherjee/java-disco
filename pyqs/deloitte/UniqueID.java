package pyqs.deloitte;

import java.util.Scanner;

public class UniqueID {

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

        int result = findSingle(arr, n);
        System.out.println(result);

        sc.close();
    }

    public static int findSingle(int[] arr, int n) {
        // TODO: Implement O(N) time and O(1) space logic using XOR

        int unique = 0;

        for(int i = 0; i<n; i++)
        {
            unique = unique^arr[i];
        }

        
        return unique;
    }
}