package vector;

import java.util.*;
public class V2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        // remove duplicates while preserving order
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (v.get(i).equals(v.get(j))) {
                    v.remove(i);
                    i--;
                    break;
                }
            }
        }

        System.out.println(v);
    }
}