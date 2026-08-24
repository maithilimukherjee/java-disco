package pyqs.deloitte;
import java.util.Scanner;

class Node {
    int velocity;
    int mass;
    Node next;

    Node(int velocity, int mass) {
        this.velocity = velocity;
        this.mass = mass;
        this.next = null;
    }
}

public class TotalMomentum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        
        int n = sc.nextInt();
        
        Node head = null;
        Node tail = null;
        
        // Build the linked list with n nodes
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int m = sc.nextInt();
            
            Node newNode = new Node(v, m);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        int result = calculateTotalMomentum(head);
        System.out.println(result);
        
        sc.close();
    }

    public static int calculateTotalMomentum(Node head) {
        Node current = head;
        int total = 0;

        while (current != null) {
            total += (current.mass * current.velocity);
            current = current.next;
        }

        return total;
    }
}