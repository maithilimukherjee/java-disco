package vector;

import java.util.*;
public class V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        int x = sc.nextInt();

        for (int i = 0; i < v.size(); ) {
            if (v.get(i) == x) {
                v.remove(i);
            } else {
                i++;
            }
        }

        System.out.print(v);
    }
}