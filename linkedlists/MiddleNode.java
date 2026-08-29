package linkedlists;

import java.util.*;

class Node
{
    int value;
    Node next;

    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }
}

public class MiddleNode {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Node head = null;
        Node tail = null;

        for(int i=0; i<N; i++)
        {
            int value = sc.nextInt();

            Node node = new Node(value);

            if(head==null)
            {
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }

        Node slow = head;
        Node fast = head.next.next;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow!=null)
        System.out.println(slow.next.value);

        
    }
}
