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

public class ThreePReverse {

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node head = null;
        Node tail = null;

        
        for(int i = 0; i<N; i++)
        {
            int val = sc.nextInt();

            Node node = new Node(val);

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

        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        current = head;

        while(current!=null)
        {
            System.out.print(current.value+" ");
            current = current.next;
        }
    }
    
}
