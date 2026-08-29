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

public class SumLL

{

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of nodes: ");

        int n = sc.nextInt();



        int i = 0;

        int value = 0;



        Node head = null;

        Node tail = null;



        while(i<n)

        {

            value = sc.nextInt();



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



            i++;

           

        }



        int sum = 0;



        Node current = head;



        while(current!=null)

        {

            sum=sum+current.value;

            current=current.next;

        }



        System.out.println("sum of all nodes: "+sum);



        current = head;



        System.out.println("printing the linkedlist: ");



        while(current!=null)

        {

            System.out.print(current.value+" ");

            current = current.next;

        }



        System.out.println();



    }

}