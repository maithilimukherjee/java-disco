package sliding_windows;
import java.util.*;

public class MaxDistinct {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // first window
        for (int i = 0; i < K; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxDistinct = map.size();

        // slide the window
        for (int i = K; i < N; i++) {

            // remove outgoing element
            int outgoing = arr[i - K];

            map.put(outgoing, map.get(outgoing) - 1);

            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }

            // add incoming element
            int incoming = arr[i];

            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            // update answer
            maxDistinct = Math.max(maxDistinct, map.size());
        }

        System.out.println(maxDistinct);
    }
}