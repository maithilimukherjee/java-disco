package stack;

import java.util.*;

public class NextSmaller {

    static int[] nextSmaller(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        int currentElement = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            // remove elements that cannot be
            // the next smaller element
            currentElement = arr[i];
            while(!stack.isEmpty() && stack.peek()>=currentElement)
            {
                stack.pop();
            }

            if(stack.isEmpty())
                result[i]=-1;

            else
                result[i]=stack.peek();
            
            // push current element
            stack.push(currentElement);

        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = nextSmaller(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}