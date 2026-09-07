//a simple program to demonstrate the use of deque

package deque;
import java.util.*;

public class D1 {

    public static void main(String args[]) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);

        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        dq.addFirst(5);
        System.out.println(dq);

        dq.addLast(50);
        System.out.println(dq);


    }
}