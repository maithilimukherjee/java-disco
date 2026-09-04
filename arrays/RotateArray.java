package arrays;
import java.util.*;

public class RotateArray {

    public static void rotateArr(int arr[], int d) {
        int temp = 0;
        int k = 0;

        while (k < d) {
            temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                if (i == arr.length - 2) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                } else {
                    arr[i] = arr[i + 1];
                }
            }

            k++;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;

        rotateArr(arr, d);

        System.out.println("rotated array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}