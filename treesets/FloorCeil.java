package treesets;
import java.util.*;

public class FloorCeil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            int x = sc.nextInt();

            // write your logic here
            // find floor(x) and ceiling(x)

            Integer closestSmallest = set.floor(x);
            Integer closestLargest = set.ceiling(x);

            if (closestSmallest != null) {
                System.out.print(closestSmallest + " ");
            } else {
                System.out.print(-1 + " ");
            }

            if (closestLargest != null) {
                System.out.println(closestLargest);
            } else {
                System.out.println(-1);
            }

        }

        sc.close();
    }
}