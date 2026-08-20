package treesets;
import java.util.*;

public class CS{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for(int x: arr) {
            set.add(x);
        }

        while (q-- > 0) {

            int x = sc.nextInt();
            Integer smallest = set.ceiling(x);
            if (smallest != null) {
                System.out.println(smallest);
            } else {
                System.out.println(-1);
            }

        }

        sc.close();
    }
}