package linkedlists;
import java.util.*;

class Node
{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}
public class ReverseLL {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Node head = null;
        Node tail = null;

        int i = 0;

        while(i<N)
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

            i++;
        }

        Node prev = null;
        Node current = head;

        while(current!=null)
        {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;

        current = head;

        while(current!=null)
        {
            System.out.print(current.value+" ");

            current = current.next;
        }

        System.out.println();

    }
}
