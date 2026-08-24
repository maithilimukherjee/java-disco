package pyqs.deloitte;

import java.util.*;

public class NKBits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        System.out.println("enter k");
        int k = sc.nextInt();
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (bitsCount(i) == k) {
                res++;
            }
        }

        System.out.println(res);
        sc.close();
    }

    // Unused parameter 'k' removed
    public static int bitsCount(int num) {
        int copy = num;
        int count = 0;

        while (copy > 0) {
            if (copy % 2 == 1) {
                count++;
            }
            copy = copy / 2;
        }
        
        return count;
    }
}