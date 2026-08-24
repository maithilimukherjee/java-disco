package vector;

import java.util.*;

public class V3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).equals(x)) {
                count++;
            }
        }

        System.out.println(count);
    }
}